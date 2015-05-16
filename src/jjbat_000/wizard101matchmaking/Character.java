package jjbat_000.wizard101matchmaking;

import jjbat_000.wizard101matchmaking.Main;

public class Character {

	private int critical;
	private int rank;
	private int level;
	private int name;
	//private Main main;

	public QueueType type = QueueType.DEFAULT;

	public Character(int name, int critical, int rank, int level) {
		setName(name);
		setCritical(critical);
		setRank(rank);
		setLevel(level);
	}

	public boolean canCrit() {
		if (getCritical() >= 1) {
			return true;
		}
		return false;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getCritical() {
		return critical;
	}

	public void setCritical(int critical) {
		this.critical = critical;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public enum QueueType {
		DEFAULT, NOCRIT, LOWCRIT, MEDCRIT, HIGHCRIT, NOVICE, APPRENTICE, INITIATE, JOURNEYMAN, ADEPT, MAGUS, MASTER, GRANDMASTER, LEGENDARY, TRANSCENDED, ARCHMAGE, PROMETHEAN, EXALTED
	}

	public void setQueueType(QueueType type) {
		this.type = type;
	}

	public QueueType getQueueType() {
		return type;
	}

	public void decideQueueType(int name, int level) {
		if (level > 1 && level <= 5) {
			setQueueType(QueueType.NOVICE);
			Main.novice.add(name);
		} else if (level > 5 && level <= 9) {
			setQueueType(QueueType.APPRENTICE);
			Main.apprentice.add(name);
		} else if (level > 9 && level <= 14) {
			setQueueType(QueueType.INITIATE);
			Main.initiate.add(name);
		} else if (level > 14 && level <= 19) {
			setQueueType(QueueType.JOURNEYMAN);
			Main.journeyman.add(name);
		} else if (level > 19 && level <= 29) {
			setQueueType(QueueType.ADEPT);
			Main.adept.add(name);
		} else if (level > 29 && level <= 39) {
			setQueueType(QueueType.MAGUS);
			Main.magus.add(name);
		} else if (level > 39 && level <= 49) {
			setQueueType(QueueType.MASTER);
			Main.master.add(name);
		} else if (level > 49 && level <= 59) {
			setQueueType(QueueType.GRANDMASTER);
			Main.grandmaster.add(name);
		} else if (level > 59 && level <= 69) {
			setQueueType(QueueType.LEGENDARY);
			Main.legendary.add(name);
		} else if (level > 69 && level <= 79) {
			setQueueType(QueueType.TRANSCENDED);
			Main.transcendent.add(name);
		} else if (level > 79 && level <= 89) {
			setQueueType(QueueType.ARCHMAGE);
			Main.archmage.add(name);
		} else if (level > 89 && level <= 99) {
			setQueueType(QueueType.PROMETHEAN);
			Main.promethean.add(name);
		} else if (level == 100) {
			setQueueType(QueueType.EXALTED);
			Main.exalted.add(name);
		}
	}

}
