/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DrawingEditor;

/**
 *
 * @author fgull
 */
public class When {
    @ExpectedScenarioState
    @ProvidedScenarioState
    private SVGImageFigure imageInstance;
            
            @BeforeStage
    private void before() {
        imageInstance = new SVGImageFigure();
    }
    When setX(){
        imageInstance.getRectangle().x = 0.0;
        return this;
    }
}
