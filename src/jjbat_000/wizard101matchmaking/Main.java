package jjbat_000.wizard101matchmaking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import jjbat_000.wizard101matchmaking.Character.QueueType;

public class Main {

	private static Random rand = new Random();
	public static HashMap<Integer, Character> opponents = new HashMap<Integer, Character>();
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
	public static List<Integer> noMatch = new ArrayList<Integer>();
	private static Character ch;
	private static Character op;
	private static int numOpponents = 0;
	private static int maxCritValue = 100;
	private static int maxLevelValue = 10;
	private static int maxRankValue = 100;

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
		if (l < 50) {
			Character character = new Character(-1, 1, r, l);
			ch = character;
			System.out.println("Here are your stats..");
			System.out.println("Level = " + character.getLevel());
			System.out.println("Rank = " + character.getRank());
			character.decideQueueType(-1, l);
		} else {
			System.out
					.println("Please input the critical you would like.. (0 - 600)");
			String crit = reader.next();
			int c = new Integer(crit);
			Character character = new Character(-1, c, r, l);
			ch = character;
			System.out.println("Here are your stats..");
			System.out.println("Level = " + character.getLevel());
			System.out.println("Rank = " + character.getRank());
			System.out.println("Critical = " + character.getCritical());
			character.decideQueueType(-1, l);
		}

		try {
			Thread.sleep(1000 * 3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out
				.println("Please input how many opponents you would like to be randomly generated");
		String opp = reader.next();
		int oppAmount = new Integer(opp);
		numOpponents = oppAmount;
		System.out.println("Generating " + opp + " opponents...");
		long old = System.currentTimeMillis();
		for (int x = 0; x < oppAmount; x++) {
			int oppCrit = rand.nextInt(600 - 1);
			int oppRank = rand.nextInt(6000 - 1);
			int oppLevel = rand.nextInt(100 - 1);
			Character opponent = new Character(x, oppCrit, oppRank, oppLevel);
			opponent.decideQueueType(x, oppLevel);
			opponents.put(x, opponent);
			op = opponent;
		}
		long current = System.currentTimeMillis();
		if (ch.getQueueType() == QueueType.LEGENDARY) {
			long time = current - old;
			System.out.println("There are " + legendary.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.NOVICE) {
			long time = current - old;
			System.out.println("There are " + novice.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.APPRENTICE) {
			long time = current - old;
			System.out.println("There are " + apprentice.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.INITIATE) {
			long time = current - old;
			System.out.println("There are " + initiate.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.JOURNEYMAN) {
			long time = current - old;
			System.out.println("There are " + journeyman.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.ADEPT) {
			long time = current - old;
			System.out.println("There are " + adept.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.MAGUS) {
			long time = current - old;
			System.out.println("There are " + magus.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.MASTER) {
			long time = current - old;
			System.out.println("There are " + master.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.GRANDMASTER) {
			long time = current - old;
			System.out.println("There are " + grandmaster.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.TRANSCENDED) {
			long time = current - old;
			System.out.println("There are " + transcendent.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.ARCHMAGE) {
			long time = current - old;
			System.out.println("There are " + archmage.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.PROMETHEAN) {
			long time = current - old;
			System.out.println("There are " + promethean.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		} else if (ch.getQueueType() == QueueType.EXALTED) {
			long time = current - old;
			System.out.println("There are " + exalted.size()
					+ " opponents in your queue!");
			System.out.println("Took " + time
					+ " ms to generate the opponents!");
		}

		System.out.println("Attempting to find a close match...");

		long oldTime = System.currentTimeMillis();
		findMatch(ch);
		if (op != null) {
		System.out
				.println("You have been matched! Here are the stats of your opponent...");
		System.out.println("Level - " + op.getLevel());
		System.out.println("Rank - " + op.getRank());
		System.out.println("Critical - " + op.getCritical());
		long currentTime = System.currentTimeMillis();
		long now = currentTime - oldTime;
		System.out.println("Took " + now + " ms to find a match!");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thanks for using the new matchmaking system!");
		} else {
				int failOpp = noMatch.get(rand.nextInt(noMatch.size()));
				Character f = getCharacter(failOpp);
				
				System.out.println("WARNING: Unable to find a fair match!");
				System.out.println("Begin Error Log......");
				System.out.println("---------------------");
				System.out.println("Your Level - " + ch.getLevel());
				System.out.println("Your Rank - " + ch.getRank());
				System.out.println("Your Critical - " + ch.getCritical());
				System.out.println("-*-*-*-*-*-*-*-*-*-*-");
				System.out.println("Opp Level - " + f.getLevel());
				System.out.println("Opp Rank - " + f.getRank());
				System.out.println("Opp Critial - " + f.getCritical());
				System.out.println("*********************");
				System.out.println("Number of random opponents - " + numOpponents);
				System.out.println("----------------------");
				System.out.println("End Error Log.........");
				System.out
						.println("Please report error to - https://github.com/justin393/Wizard101Matchmking/issues");
				op = f;
		}

	}

	public static void findMatch(Character character) {
		int myCrit = character.getCritical();
		int myLevel = character.getLevel();
		int myRank = character.getRank();
		if (character.getQueueType() == QueueType.NOVICE) {
			for (int y = 0; y < novice.size(); y++) {
				int possible = novice.get(rand.nextInt(novice.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.APPRENTICE) {
			for (int y = 0; y < apprentice.size(); y++) {
				int possible = apprentice.get(rand.nextInt(apprentice.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.INITIATE) {
			for (int y = 0; y < initiate.size(); y++) {
				int possible = initiate.get(rand.nextInt(initiate.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.JOURNEYMAN) {
			for (int y = 0; y < journeyman.size(); y++) {
				int possible = journeyman.get(rand.nextInt(journeyman.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.ADEPT) {
			for (int y = 0; y < adept.size(); y++) {
				int possible = adept.get(rand.nextInt(adept.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.MAGUS) {
			for (int y = 0; y < magus.size(); y++) {
				int possible = magus.get(rand.nextInt(magus.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.MASTER) {
			for (int y = 0; y < master.size(); y++) {
				int possible = master.get(rand.nextInt(master.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.GRANDMASTER) {
			for (int y = 0; y < grandmaster.size(); y++) {
				int possible = grandmaster
						.get(rand.nextInt(grandmaster.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.LEGENDARY) {
			for (int y = 0; y < legendary.size(); y++) {
				int possible = legendary.get(rand.nextInt(legendary.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.TRANSCENDED) {
			for (int y = 0; y < transcendent.size(); y++) {
				int possible = transcendent.get(rand.nextInt(transcendent
						.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.ARCHMAGE) {
			for (int y = 0; y < archmage.size(); y++) {
				int possible = archmage.get(rand.nextInt(archmage.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.PROMETHEAN) {
			for (int y = 0; y < promethean.size(); y++) {
				int possible = promethean.get(rand.nextInt(promethean.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		} else if (character.getQueueType() == QueueType.EXALTED) {
			for (int y = 0; y < exalted.size(); y++) {
				int possible = exalted.get(rand.nextInt(exalted.size()));
				Character c = getCharacter(possible);
				int oppLevel = c.getLevel();
				int finalLevel = myLevel - oppLevel;
				int oppRank = c.getRank();
				int finalRank = myRank - oppRank;
				int oppCrit = c.getCritical();
				int finalCrit = myCrit - oppCrit;
				if (!(finalLevel < -maxLevelValue && finalLevel > maxLevelValue)) {
					if (!(finalRank < -maxRankValue && finalRank > maxRankValue)) {
						if (!(finalCrit < -maxCritValue && finalCrit > maxCritValue)) {
							op = c;
							break;
						} else {
							trashMatch(possible);
						}
					} else {
						trashMatch(possible);
					}
				} else {
					trashMatch(possible);
				}
			}

		}

	}

	public static Character getCharacter(final int x) {
		return opponents.get(x);
	}

	public static void trashMatch(int possible) {
		try {
			if (novice.contains(possible)) {
				novice.remove(possible);
				noMatch.add(possible);
			} else if (apprentice.contains(possible)) {
				apprentice.remove(possible);
				noMatch.add(possible);
			} else if (initiate.contains(possible)) {
				initiate.remove(possible);
				noMatch.add(possible);
			} else if (journeyman.contains(possible)) {
				journeyman.remove(possible);
				noMatch.add(possible);
			} else if (adept.contains(possible)) {
				adept.remove(possible);
				noMatch.add(possible);
			} else if (magus.contains(possible)) {
				magus.remove(possible);
				noMatch.add(possible);
			} else if (master.contains(possible)) {
				master.remove(possible);
				noMatch.add(possible);
			} else if (grandmaster.contains(possible)) {
				grandmaster.remove(possible);
				noMatch.add(possible);
			} else if (legendary.contains(possible)) {
				legendary.remove(possible);
				noMatch.add(possible);
			} else if (transcendent.contains(possible)) {
				transcendent.remove(possible);
				noMatch.add(possible);
			} else if (archmage.contains(possible)) {
				archmage.remove(possible);
				noMatch.add(possible);
			} else if (promethean.contains(possible)) {
				promethean.remove(possible);
				noMatch.add(possible);
			} else if (exalted.contains(possible)) {
				exalted.remove(possible);
				noMatch.remove(possible);
			} else {
				System.out.println("WARNING: Something went horribly wrong.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
