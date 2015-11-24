/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testnumromanos;

import numromanos.NumRomanos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laura Martinez
 */
public class TestNumRomanos {
    
    NumRomanos numrom;
    
    @Test
	public void testI() {
		numrom = new NumRomanos();
		String NumRomanos= numrom.convRomanos(1);
		assertEquals("I", NumRomanos);
	}
      
    @Test
        public void testII() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(2);
                assertEquals("II", NumRomanos);
        }
    
    @Test
        public void testV() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(5);
                assertEquals("V", NumRomanos);
        }
    
    @Test
        public void testIX() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(9);
                assertEquals("IX", NumRomanos);
        }
        
    @Test
        public void testX() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(10);
                assertEquals("X", NumRomanos);
        }
      
    @Test
        public void testL() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(50);
                assertEquals("L", NumRomanos);
        }
        
    @Test
        public void testC() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(100);
                assertEquals("C", NumRomanos);
        }
        
    @Test
        public void testCCXC() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(290);
                assertEquals("CCXC", NumRomanos);
        }
        
    @Test
        public void testD() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(500);
                assertEquals("D", NumRomanos);
        }
        
    @Test
        public void testDCCCXCIII() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(893);
                assertEquals("DCCCXCIII", NumRomanos);
        }
        
    @Test
        public void testM() {
                numrom = new NumRomanos();
                String NumRomanos= numrom.convRomanos(1000);
                assertEquals("M", NumRomanos);
        }
    
}
