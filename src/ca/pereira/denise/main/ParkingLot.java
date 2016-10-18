package ca.pereira.denise.main;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Random;

public class ParkingLot {
	/*
	 * - Ordenar a lista de carros de forma crescente e estacionar - Fazer dois
	 * loops e ir estacionando conforme o numero do carro e da vaga - Usar uma
	 * linkedList para adicionar os carros nas vagas, porque e mais facil de
	 * acessar as posicoes no array
	 */

	static LinkedHashMap<Integer, Integer> parkingSpots = new LinkedHashMap<>();// starts
																				// with
																				// 0
	static int[] cars = null; // starts with 1

	/* starts the car sequence with N # of cars */
	public static void fillCar(int N) {
		cars = new int[N];

		for (int i = 0; i < cars.length; i++) {
			cars[i] = i + 1;
		}
	}

	/* starts the car sequence with N # of cars */
	public static void fillCarRandom(int N) {
		Random r = new Random();
		cars = new int[N];

		for (int i = 0; i < cars.length; i++) {
			cars[i] = r.nextInt(i) + 1;
		}
	}

	/* starts the parking spots with N+1# of spots */
	public static void fillSpots(int N) {
		int spots = N + 1;

		for (int i = 0; i < spots; i++) {
			parkingSpots.put(i, null);
		}
	}

	/* park the cars of its spots */
	public static void parkingCar() {

		for (int car : cars) {
			parkingSpots.put(car, car);
		}
	}

	public static void output(LinkedHashMap<Integer, Integer> parkingSpots) {
		Set<Entry<Integer, Integer>> spots = parkingSpots.entrySet();

		for (Entry<Integer, Integer> e : spots) {
			System.out.println(" Parking Spot: " + e.getKey() + " | Car parked: " + e.getValue());
			System.out.println();
		}
	}

}
