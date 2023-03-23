package com.mycompany.app.game.gameClass;

import com.mycompany.app.game.enums.GameResultEnum;
import com.mycompany.app.game.gameInterface.Hand;

public class Scissor implements Hand {

    @Override
    public GameResultEnum play(Hand hand) {
      return hand.play(this);
    }

    @Override
    public GameResultEnum play(Paper paper) {
       return GameResultEnum.WIN;
    }

    @Override
    public GameResultEnum play(Rock rock) {
     return GameResultEnum.LOSE;
    }

    @Override
    public GameResultEnum play(Scissor scissor) {
     return GameResultEnum.SAME;
    }
    
}
