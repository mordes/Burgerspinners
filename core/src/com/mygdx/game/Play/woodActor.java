package com.mygdx.game.Play;

import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.OneSpriteStaticActor;
import com.mygdx.game.WorldGenerate.Generator;

/**
 * Created by tanulo on 2017. 01. 23..
 */
public class woodActor extends mapActor {
    private int posArrayX,posArrayY;


    public woodActor(int x, int y) {
        super(new OneSpriteStaticActor(Assets.manager.get(Assets.GRASS_BLOCK)){
            @Override
            public void init() {
                super.init();
                setSize(128,128);
            }
        }, x, y);
        posArrayX = x;
        posArrayY = y;
        addActor(new OneSpriteStaticActor(Generator.vel(0,1) == 1?Assets.manager.get(Assets.TREE_BLOCK):Assets.manager.get(Assets.TREE3_BLOCK)){
            @Override
            public void init() {
                super.init();
                setSize(128, 128);

            }
        });
    }

    public int getPosArrayX() {
        return posArrayX;
    }

    public int getPosArrayY() {
        return posArrayY;
    }

    @Override
    public String toString() {
        return "2";
    }

}
