package com.game.rockpaperscissors;

import com.game.rockpaperscissors.game.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RockpaperscissorsApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RockpaperscissorsApplication.class, args);
        Game rockPaperScissorsGame = context.getBean(Game.class);
        rockPaperScissorsGame.play();
    }


}


