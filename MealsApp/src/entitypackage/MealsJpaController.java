/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitypackage;

import entitypackage.exceptions.NonexistentEntityException;
import entitypackage.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class MealsJpaController implements Serializable {

    public MealsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Meals meals) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(meals);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMeals(meals.getMealid()) != null) {
                throw new PreexistingEntityException("Meals " + meals + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Meals meals) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            meals = em.merge(meals);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = meals.getMealid();
                if (findMeals(id) == null) {
                    throw new NonexistentEntityException("The meals with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Meals meals;
            try {
                meals = em.getReference(Meals.class, id);
                meals.getMealid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The meals with id " + id + " no longer exists.", enfe);
            }
            em.remove(meals);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Meals> findMealsEntities() {
        return findMealsEntities(true, -1, -1);
    }

    public List<Meals> findMealsEntities(int maxResults, int firstResult) {
        return findMealsEntities(false, maxResults, firstResult);
    }

    private List<Meals> findMealsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Meals.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Meals findMeals(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Meals.class, id);
        } finally {
            em.close();
        }
    }

    public int getMealsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Meals> rt = cq.from(Meals.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
