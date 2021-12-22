/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author fgull
 */
public class Then {
     @ExpectedScenarioState

    private SVGImageFigure imageInstance;
            
    Then assertXisSet(){
        double instanceX = imageInstance.getRectangle().x;
        double zero = 0.0;
        System.out.println("instanceX " + instanceX);
        assertTrue(zero == instanceX);
        return this;
    }
}
