package com.pannam.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by pannam on 3/18/2017.
 */

public class GameStateManager {

    //like array but holdes states of game
    private Stack<State> states;

    //constructor
    public GameStateManager(){
        states= new Stack<State>();

    }

   public void push (State state){
       states.push(state);

   }

   public void pop (){
       states.pop();
   }

   public void set(State state){
       states.push(state);
       states.pop();

   }

   public void update(float dt){
       states.peek().update(dt);
   }

   public void render(SpriteBatch sb){
       states.peek().render(sb);
   }

}
