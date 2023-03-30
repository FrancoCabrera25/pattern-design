/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import com.mycompany.app.game.enums.GameResultEnum;
import com.mycompany.app.game.gameClass.Paper;
import com.mycompany.app.game.gameClass.Rock;
// import com.mycompany.app.game.gameClass.Scissor;
import com.mycompany.app.game.gameInterface.Hand;

public class App {
    public static void main(String[] args) {
        Hand playerOne = new Paper();
        Hand playerTwo = new Rock();

        GameResultEnum resultGame = playerOne.play(playerTwo);

        if (resultGame == GameResultEnum.WIN) {
            System.out.println("gano Machine " + resultGame.toString());
        } else if (resultGame == GameResultEnum.LOSE) {

            System.out.println("Gano player !!!!!!!");
        }else {
            System.out.println("Empate ");
        }

    }
}
