/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import javax.swing.Action;
import org.jhotdraw.draw.ConnectionFigure;
import org.jhotdraw.draw.Connector;
import org.jhotdraw.draw.Handle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fgull
 */
public class SVGImageFigureTest {
    
    public SVGImageFigureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetheight() throws IOException{
       SVGImageFigure instance = new SVGImageFigure();
        File file;
        //Loading an image which is 20x20
        URL url = SVGImageFigureTest.class.getResource("/image.jpg");
        System.out.println(url);
        if (url != null) {
            file = new File(url.getFile());
            instance.loadImage(file);
            assertEquals(instance.getBufferedImage().getHeight(), 20);
        } else {
            fail("Image load failed");
        }
    }

    @Test
    public void testimageLoading() throws IOException {
        SVGImageFigure instance = new SVGImageFigure();
        File file;
        //Loading an image which is 20x20
        URL url = SVGImageFigureTest.class.getResource("/image.jpg");
        if (url != null) {
            file = new File(url.getFile());
            instance.loadImage(file);
            assertNotNull(instance.getBufferedImage());
        } else {
            fail("Image load failed");
        }
    }

    @Test
    public void testGetWidth() throws IOException {
       SVGImageFigure instance = new SVGImageFigure();
        File file;
        //Loading an image which is 20x20
        URL url = SVGImageFigureTest.class.getResource("/image.jpg");
        System.out.println(url);
        if (url != null) {
            file = new File(url.getFile());
            instance.loadImage(file);
            assertEquals(instance.getBufferedImage().getWidth(), 20);
        } else {
            fail("Image load failed");
        }
    }

}
