/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import com.mycompany.app.game.enums.GameResultEnum;
import com.mycompany.app.game.gameClass.Paper;
import com.mycompany.app.game.gameClass.Rock;
import com.mycompany.app.game.gameClass.Scissor;
import com.mycompany.app.game.gameInterface.Hand;

public class App {
    public static void main(String[] args) {
        Hand player = new Paper();
        Hand machine = new Rock();

        GameResultEnum ganaMachine = player.play(machine);
        GameResultEnum ganaPlayer = machine.play(player);
        System.out.println("Hello Remote World! " + ganaMachine.toString()) ;

        System.out.println("Hello Remote World! " + ganaPlayer.toString()) ;
    }
}
