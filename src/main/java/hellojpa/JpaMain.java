package hellojpa;

import hellojpa.domain.Member;
import hellojpa.domain.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class JpaMain {
    public static void main(String[] args) {
        // 애플리케이션 로딩 시점에 하나만 만들어야 함.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        // 트랜잭션이 있어서 커넥션을 열어야 할때는 이거
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{

            /*Movie movie = new Movie();
            movie.setActor("actor");
            movie.setDirector("감독");
            movie.setName("movie name");
            movie.setPrice(10000);

            em.persist(movie);*/

//            Member member = new Member();
//            member.setCreatedDate(LocalDateTime.now());

//            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        em.close();

        emf.close();

    }
}
