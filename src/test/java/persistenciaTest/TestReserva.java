package persistenciaTest;

import models.Reserva;
import persistencia.PersistenceManager;

public class TestReserva {

		public static void main(String[] args) {
			PersistenceManager manager = new PersistenceManager();
			Reserva reserva = new Reserva();
			reserva = manager.getReserva(1);
			System.out.println(reserva.toString());
		}
}
