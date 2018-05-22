package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {

		try {// tente
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulaPu");

			EntityManager manager = fabrica.createEntityManager();
			EntityTransaction transacao = manager.getTransaction();
			transacao.begin();
			
			//manager.persist(.args..);
			//manager.marge.(.args..);
			//maneger.remove(.args..);
			//meneger.find(.args..)
			
			transacao.commit();
			
		} catch (Exception e) {//capture o erro

			e.printStackTrace(); // imprime erro
		} finally { // no final

		}

	}

}
