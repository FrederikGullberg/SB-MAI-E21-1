/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.junit.ScenarioTest;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

/**
 *
 * @author fgull
 */
public class AcceptanceTest extends ScenarioTest<GivenX, When, Then> {
    
    @Test
    public void CheckIfRectangleXisSetCorrectly(){
        given().givenX();
        when().setX();
        then().assertXisSet();
        
    }
}
