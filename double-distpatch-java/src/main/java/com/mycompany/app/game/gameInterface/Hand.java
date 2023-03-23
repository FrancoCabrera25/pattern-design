package com.mycompany.app.game.gameInterface;

import com.mycompany.app.game.enums.GameResultEnum;
import com.mycompany.app.game.gameClass.Paper;
import com.mycompany.app.game.gameClass.Rock;
import com.mycompany.app.game.gameClass.Scissor;

public interface Hand {

    GameResultEnum play(Hand hand);

    GameResultEnum play(Paper paper);

    GameResultEnum play(Rock rock);

    GameResultEnum play(Scissor scissor);
}
