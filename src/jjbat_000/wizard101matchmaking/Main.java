package jjbat_000.wizard101matchmaking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import jjbat_000.wizard101matchmaking.Character.QueueType;

public class Main {

	private static Random rand = new Random();
	public static List<Integer> novice = new ArrayList<Integer>();
	public static List<Integer> apprentice = new ArrayList<Integer>();
	public static List<Integer> initiate = new ArrayList<Integer>();
	public static List<Integer> journeyman = new ArrayList<Integer>();
	public static List<Integer> adept = new ArrayList<Integer>();
	public static List<Integer> magus = new ArrayList<Integer>();
	public static List<Integer> master = new ArrayList<Integer>();
	public static List<Integer> grandmaster = new ArrayList<Integer>();
	public static List<Integer> legendary = new ArrayList<Integer>();
	public static List<Integer> transcendent = new ArrayList<Integer>();
	public static List<Integer> archmage = new ArrayList<Integer>();
	public static List<Integer> promethean = new ArrayList<Integer>();
	public static List<Integer> exalted = new ArrayList<Integer>();

	public static void main(String[] args) {

		System.out
				.println("This is a proof of concept to prove that the matchmaking system can be improved upon");

		try {
			Thread.sleep(1000 * 3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scanner reader = new Scanner(System.in);
		System.out
				.println("Here we will input some basic information to find a fair match. Input the stats that you would like.");
		System.out.println("Please input the level you would like.. (1 - 100)");
		String level = reader.next();
		int l = new Integer(level);
		System.out.println("Please input the rank you would like.. (1 - 3000)");
		String rank = reader.next();
		int r = new Integer(rank);
		System.out
				.println("Please input the critical you would like.. (1 - 600)");
		String crit = reader.next();
		int c = new Integer(crit);
		Character character = new Character(-1, c, r, l);
		System.out.println("Here are your stats..");
		System.out.println("Level = " + character.getLevel());
		System.out.println("Rank = " + character.getRank());
		System.out.println("Critical = " + character.getCritical());
		character.decideQueueType(-1, l);
		try {
			Thread.sleep(1000 * 3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out
				.println("Please input how many opponents you would like to be randomly generated");
		String opp = reader.next();
		int oppAmount = new Integer(opp);
		System.out.println("Generating " + opp + " opponents...");
		long old = System.currentTimeMillis();
		for (int x = 0; x < oppAmount; x++) {
			int oppCrit = rand.nextInt(600 - 1);
			int oppRank = rand.nextInt(6000 - 1);
			int oppLevel = rand.nextInt(100 - 1);
			Character opponent = new Character(x, oppCrit, oppRank, oppLevel);
			opponent.decideQueueType(x, oppLevel);
		}
		long current = System.currentTimeMillis();
		if (character.getQueueType() == QueueType.LEGENDARY) {
			long time = current - old;
			System.out.println("There are " + legendary.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.NOVICE) {
			long time = current - old;
			System.out.println("There are " + novice.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.APPRENTICE) {
			long time = current - old;
			System.out.println("There are " + apprentice.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.INITIATE) {
			long time = current - old;
			System.out.println("There are " + initiate.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.JOURNEYMAN) {
			long time = current - old;
			System.out.println("There are " + journeyman.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.ADEPT) {
			long time = current - old;
			System.out.println("There are " + adept.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.MAGUS) {
			long time = current - old;
			System.out.println("There are " + magus.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.MASTER) {
			long time = current - old;
			System.out.println("There are " + master.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.GRANDMASTER) {
			long time = current - old;
			System.out.println("There are " + grandmaster.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.TRANSCENDED) {
			long time = current - old;
			System.out.println("There are " + transcendent.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.ARCHMAGE) {
			long time = current - old;
			System.out.println("There are " + archmage.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.PROMETHEAN) {
			long time = current - old;
			System.out.println("There are " + promethean.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (character.getQueueType() == QueueType.EXALTED) {
			long time = current - old;
			System.out.println("There are " + exalted.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		}

	}

	public static void findMatch(Character character) {

	}

}
