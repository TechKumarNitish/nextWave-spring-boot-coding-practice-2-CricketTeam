// Write your code here.
package com.example.player;

public class Player {
    int playerId;
    String playerName;
    int jerseyNumber;
    String role;

    public Player(int playerId, String playerNamer, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerNamer;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPalyerName(String playerName) {
        this.playerName = playerName;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setRole(String role) {
        this.role = role;
    }

}