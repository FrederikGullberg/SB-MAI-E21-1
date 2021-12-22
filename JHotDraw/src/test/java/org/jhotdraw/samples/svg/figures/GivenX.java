/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

/**
 *
 * @author fgull
 */
public class GivenX extends Stage<GivenX> {
    @ProvidedScenarioState
    private SVGImageFigure imageInstance;
    
        @BeforeStage
    private void before() {
        imageInstance = new SVGImageFigure();
    }
    GivenX givenX(){
        imageInstance.getX();
        return this;
    }
    

}
