package ru.otus.spring.dao;

import ru.otus.spring.entity.Game;

public interface GameDao {
    Game getGameForStudent(String name);
    void increaseScore();
    int getScore();
}
