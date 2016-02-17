/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import gfx.ImageManager;
import main.Game;
import java.awt.Graphics;
import levels.Level;

/**
 *
 * @author micahmehan
 */
public class Lives {
  public final int lx;
  public final int ly;
  private final ImageManager im;
  public static int numLives;
 
  
  public Lives(int rx, int ry, ImageManager im) {
  this.lx = 0;
  this.ly = 2;
  this.im = im;
    }
  public void render(Graphics g, int x, int y) {
    g.drawImage(im.rock, x, y, Game.TILESIZE * Game.SCALE, Game.TILESIZE * Game.SCALE, null);
  }
  public static void incLives(int x, int y, int poslife) {
      numLives = 1;
      //changes position of the rock so you can't pick it up again
      Level.arrayLives [poslife][0] = 0;
      Level.arrayLives [poslife][1] = 0;
  }
  public static void decRocks() {
      numLives = 0; 
  }
  public static int getLives() {return numLives;}

}
