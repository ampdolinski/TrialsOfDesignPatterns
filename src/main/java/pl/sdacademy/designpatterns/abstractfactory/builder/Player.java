package pl.sdacademy.designpatterns.abstractfactory.builder;

import java.util.List;

public class Player {

    private int health;
    private int mana;
    private String nick;
    private long level;
    private List<String> friends;

    public Player(int health, int mana, String nick, long level, List<String> friends) {
        this.health = health;
        this.mana = mana;
        this.nick = nick;
        this.level = level;
        this.friends = friends;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public static class Builder {
        private int health;
        private int mana;
        private String nick;
        private long level;
        private List<String> friends;

        public Builder withHealthe(final int health){
            this.health = health;
            return this;
        }

        public Builder withMana(final int mana) {
            this.mana = mana;
            return this;
        }

        public Builder withNick(final String nick) {
            this.nick = nick;
            return this;
        }

        public Builder withLevel(final long level) {
            this.level = level;
            return this;
        }

        public Builder withFriends(final List<String> friends) {
            this.friends = friends;
            return this;
        }

        public Player build(){
            return new Player(health, mana, nick, level, friends);
        }

    }

}
