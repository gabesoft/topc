package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class bloggoDocStructureTest {
  bloggoDocStructure bloggodocstructure = new bloggoDocStructure();

  @Test
  public void case1() {
    String[] docA = { "<html> <h1>Snapping Turtles</h1> <ul> <li> <h2>", "Common Snapping Turtle (<i>Chelydra serpentina</i>", ") </h2> <p> With its dark coloring, sinuous neck,", "and swift lunging motion, Chelydra serpentina is a", "n adept hunter. </p><p> The snapping turtle rarely", "basks. </p><p> Snapping turtle populations are jeo", "pardized by automobile traffic.   </", "p>    </li> <li> <h2> Alligator Snapping Turtle (", "<i>Macroclemys temminckii</i>) </h2> <p> Like the", " common snapping turtle, the alligator snapping ", "turtle has a massive head.</p><p>This is the lar", "gest freshwater turtle. A tubular pink append", "age grows from its mouth.</p>   <", "/li> </ul> </html>" };
    String[] docB = { " <html> turtles <h1> snapping </h1> <ul> <li> <h2", "> common <i> chelydra serpentina </i> </h2> <p>", "hunter </p> (adept?) <p> rarely basks </p> (hmm)", "<p> jeopardized by traffic </p></li>", "<li> often confused with... <h2> alligator snapp", "ing turtle <i>macroclemys temminckii</i> </h2>", "<p> massive head </p> big! <p>", "largest freshwater turtle. pink wormlike thing <", "/p></li></ul></html>  " };
    assertEquals("equivalent", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case2() {
    String[] docA = { " <html> turtles <h1> snapping </h1> <ul> <li> <h2", "> common <i> chelydra serpentina </i> </h2> <p>", "hunter </p> (adept?) <p> rarely basks </p> (hmm)", "<p> jeopardized by traffic </p></li>", "<li> often confused with... <h2> alligator snapp", "ing turtle <i>macroclemys temminckii</i> </h2>", "<p> massive head </p> big! <p>", "largest freshwater turtle. pink wormlike thing <", "/p></li></ul></html>  " };
    String[] docB = { "<html><h1></h1><ul><li><h2><i></i></h2><p></p><p>", "</p><p></p></li><li><h2><i></i></h2><p></p><p></p", "></li></ul></html>" };
    assertEquals("equivalent", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case3() {
    String[] docA = { "<html><h1></h1><ul><li><h2><i></i></h2><p></p><p>", "</p><p></p></li><li><h2><i></i></h2><p></p><p></p", "></li></ul></html>" };
    String[] docB = { " <html> snapping turtles <ul> <li> common ", "snapping turtle, chelydra serpentina <p>", "hunter </p> <p> rarely basks </p> ", "<p> jeopardized by traffic </p></li>", "<li> often confused with... <h2> alligator snapp", "ing turtle <i>macroclemys temminckii</i> </h2>", "<p> massive head; largest freshwater turtle;", "pink wormlike appendage lures fish </p>", "</li></ul></html>  " };
    assertEquals("outtree 4", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case4() {
    String[] docA = { "<html><h1></h1><ul><li><h2><i></i></h2><p></p><p>", "</p><p></p></li><li><h2><i></i></h2><p></p><p></p", "></li></ul></html>" };
    String[] docB = { " <html> turtles <h1> snapping </h1> <ul> <li> <h2", "> common <i> chelydra serpentina </i> </h2> <p>", "hunter </p> <p> rarely basks <h3>", "<i>almost</i> <b>never</b> </h3> </p>", "<p> jeopardized by traffic </p></li>", "<li> often confused with... <h2> alligator snapp", "ing turtle <i>macroclemys temminckii</i> </h2>", "<p> massive head </p> big! <p>", "largest freshwater turtle. </p> <p> <b>pink</b>", " <b>wormlike</b> lure in mouth </p> <p> imposing", "sight on land or water </p> </li></ul></html>  " };
    assertEquals("intree 7", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case5() {
    String[] docA = { "<html><h1></h1><ul><li><h2><i></i></h2><p></p><p>", "</p><p></p></li><li><h2><i></i></h2><p></p><p></p", "></li></ul></html>" };
    String[] docB = { "<html><ul><li><h2><i></i></h2><p></p><p>", "</p><p></p></li><li><h2><i></i></h2><p></p><p></p", "></li></ul><h1></h1></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case6() {
    String[] docA = { "<html></html>" };
    String[] docB = { "<html><html><html></html><html></html><ul>", "</ul><ol></ol></html></html>" };
    assertEquals("intree 5", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case7() {
    String[] docA = { "<html><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><b></b></html>" };
    String[] docB = { "<html><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p><p></p>", "<p></p><p></p><p></p><p></p><p></p><p></p></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case8() {
    String[] docA = { "<html><li><ul><p></p><i></i></ul></li><ul><h2></h2", "><u></u></ul><ul><ul><h1><i><u></u></i><html><html", "></html><html></html></html></h1><h1><html></html>", "</h1><b></b></ul><p><h2></h2><li></li></p></ul><b>", "<html><ul><ol><h1></h1></ol><ol><li></li></ol></ul", "><h1></h1><h3></h3></html><li><h3></h3></li><ul><u", "><p></p></u></ul><u></u><ol><h1><h3><li></li></h3>", "<ol></ol></h1></ol><h2></h2></b><h1></h1><ol></ol>", "</html>" };
    String[] docB = { "<html><li><ul><p></p><i></i></ul></li><ul><h2></h2", "><u></u></ul><b><html><ul><ol><h1></h1></ol><ol><l", "i></li></ol></ul><h1></h1><h3></h3></html><li><h3>", "</h3></li><ul><u><p></p></u></ul><u></u><ol><h1><h", "3><li></li></h3><ol></ol></h1></ol><h2></h2></b><h", "1></h1><ol></ol></html>" };
    assertEquals("outtree 14", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case9() {
    String[] docA = { "<html><h1><h2><i><i></i></i><u></u><li></li><h3><l", "i><html><li></li></html><li></li></li></h3><ol><u>", "</u></ol></h2><h3><li></li><ol></ol></h3><ul><li><", "h2><p><li><h1></h1><i><html></html></i></li></p><u", "l></ul></h2><html></html><p><h1><html></html></h1>", "</p><ol></ol></li><i><ul><p><html></html></p></ul>", "<p></p><u></u></i><h2></h2><ol><h3></h3><h3><b></b", "></h3></ol></ul><h1><h1><html></html></h1><ol><h1>", "<li><u></u></li></h1><ol></ol></ol><i><p></p></i><", "h1></h1><h3><p></p></h3><ol></ol></h1><h3><p><ol><", "ul><p><ul><b></b><h3></h3></ul><h3><html></html><i", "></i></h3><h1></h1></p><p></p><li><p></p></li></ul", "><ul><i><i></i></i><ul></ul></ul><h1><u><li></li><", "/u><p></p></h1><li></li></ol></p><h2><h1><h1></h1>", "<b></b></h1><h2></h2><ul><h1></h1><html></html></u", "l></h2><h1><h3><u></u></h3><html></html></h1><b></", "b><u></u></h3><u><ol></ol></u><h2></h2></h1><h3><u", "><li><u><u><html><li></li></html><li><h2><i></i></", "h2><html></html></li></u><i><h1></h1><h1></h1></i>", "<li><li></li></li><u><u></u></u></u><b><ol><i><i><", "/i></i><h3></h3></ol><ol><p><b></b><ol><h3><p></p>", "</h3></ol><html></html><html></html></p></ol><p><u", "l><p></p></ul></p><i></i></b></li><b><li><h1><p></", "p></h1></li><ul></ul></b><h3><ul><p></p><i></i></u", "l><u><html><i><p></p></i></html></u><li></li></h3>", "<html><h1><h3><p><li></li></p><h1></h1></h3><h1></", "h1></h1><p></p></html><u></u><h1></h1></u><li><p><", "html></html></p></li><u></u></h3><p><ul><p><ul><h3", "></h3></ul></p><h2></h2></ul><i><ul><b><h2><li><b>", "<ul><ol></ol></ul><u></u></b><html></html></li><ol", "><p></p></ol><i><u></u><ol><ol></ol></ol></i></h2>", "<p></p><b><p></p></b><html></html></b><li><h1></h1", "></li><li><h2><ol><h2><li></li></h2></ol></h2><ol>", "<html><u></u></html></ol><u></u></li><i></i></ul><", "b><ol></ol></b></i><h1><h2><i><html><html></html><", "/html></i><i></i><ol></ol></h2></h1><u><html><u><i", "></i><h3></h3></u></html></u><p><ul></ul><h3><u></", "u></h3></p><ul></ul></p><u><h1></h1><i><i></i><ol>", "</ol></i></u><h2><h2><ol><b><b><i></i></b></b></ol", "></h2><ol></ol><ol><ol><b></b></ol></ol><ol></ol><", "/h2><u><html><ul><html></html></ul></html><b></b><", "html></html></u></html>" };
    String[] docB = { "<html><h1><h2><i><i></i></i><u><html></html></u><l", "i><u><p><ol><ul></ul></ol></p></u></li><h3><li><ht", "ml><li></li></html><li></li></li></h3><ol><u></u><", "/ol></h2><h3><li><html></html></li><ol></ol></h3><", "ul><li><h2><p><li><h1></h1><i><html></html></i></l", "i></p><ul></ul></h2><html></html><p><h1><html></ht", "ml></h1></p><ol></ol></li><i><ul><p><html></html><", "/p></ul><p></p><u></u></i><h2><li><u></u><ol></ol>", "</li></h2><ol><h3></h3><h3><b></b></h3></ol></ul><", "h1><h1><html></html></h1><ol><h1><li><u><p></p></u", "></li></h1><ol></ol></ol><i><p></p></i><h1></h1><h", "3><p></p></h3><ol></ol></h1><h3><p><ol><ul><p><ul>", "<b></b><h3></h3></ul><h3><html></html><i></i></h3>", "<h1></h1></p><p><html><li></li><ol></ol></html></p", "><li><p></p></li></ul><ul><ul></ul><ul></ul><i><i>", "</i></i><ul></ul></ul><h1><u><li></li></u><p></p><", "/h1><li></li></ol><i><h3></h3><ul><h2></h2></ul></", "i></p><h2><h1><h1></h1><b></b></h1><h2></h2><ul><h", "1></h1><html></html></ul></h2><h1><h3><u></u></h3>", "<html></html></h1><b></b><u></u></h3><u><ol></ol><", "/u><h2></h2></h1><h3><u><li><u><u><html><h2></h2><", "li></li></html><li><h2><i></i></h2><html></html></", "li></u><i><h1></h1><h1></h1></i><li><li></li></li>", "<u><u></u></u><p></p></u><b><ol><i><i></i></i><h3>", "</h3></ol><ol><p><b></b><ol><h3><p></p></h3></ol><", "html></html><html></html></p></ol><p><ul><p></p></", "ul></p><i></i></b></li><b><li><h1><p></p></h1><h2>", "</h2></li><ul></ul></b><h3><ul><p></p><i></i></ul>", "<u><html><i><p></p></i></html></u><li></li></h3><h", "tml><h1><h3><p><li></li></p><h1></h1></h3><h1></h1", "></h1><p></p></html><u></u><h1></h1></u><i><p><ul>", "</ul></p><li></li></i><li><p><html></html></p></li", "><ol><i></i></ol><u></u></h3><p><ul><p><ul><h3></h", "3></ul></p><h2></h2></ul><i><ul><b><h2><li><b><ul>", "<ol></ol></ul><u></u></b><html></html></li><ol><p>", "</p></ol><i><u></u><ol><ol></ol></ol></i></h2><p><", "/p><li><p></p><u></u></li><b><p></p></b><html></ht", "ml></b><li><h1></h1></li><li><h2><ol><h2><li></li>", "</h2></ol></h2><ol><html><u></u></html></ol><u></u", "></li><i></i></ul><b><ol></ol><html></html></b></i", "><h1><h2><i><html><html></html></html></i><i></i><", "ol></ol></h2></h1><u><html><u><i></i><h3></h3></u>", "</html></u><p><ul><h1><h1></h1></h1></ul><h3><u></", "u></h3></p><ul></ul></p><u><h1></h1><i><i></i><ol>", "</ol></i></u><h2><h2><ol><b><b><i></i></b></b></ol", "></h2><ol></ol><ol><ol><b></b><b></b></ol><i></i><", "/ol><ol></ol></h2><u><html><ul><html></html></ul><", "/html><b></b><html></html></u></html>" };
    assertEquals("intree 36", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case10() {
    String[] docA = { "<html><html><html><b></b><p><b></b><ul></ul><h2></", "h2></p></html><p><b><h1><html></html></h1><h3></h3", "></b><p></p></p><i></i></html><u><ol><h1></h1><i><", "h1></h1></i><ol></ol></ol><li></li></u></html>" };
    String[] docB = { "<html><html><h3><b><h2><p></p><html></html><b></b>", "</h2><u></u></b><b></b><h1><h1></h1><p></p></h1></", "h3><html></html></html><u><h2><p><i></i></p></h2><", "i></i></u><i></i></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case11() {
    String[] docA = { "<html><h2><h2><h2><h1><ol></ol></h1></h2><li><b></", "b></li></h2><ol><u></u></ol></h2><h2><p></p></h2><", "html></html><i></i></html>" };
    String[] docB = { "<html><h2><h2><h2><h1><ol></ol></h1><i><h2></h2><h", "3></h3></i></h2><li><b></b></li></h2><p><h2><html>", "<li><ul></ul></li></html><h2></h2></h2><html><html", "></html><h1></h1><h3></h3></html><h3><b></b></h3><", "u></u><h3><li></li></h3></p><li><ul><h1><h1></h1><", "html></html><u></u><i><i></i><li><u></u></li><p></", "p></i><h2></h2></h1><h3><p></p><html></html></h3><", "/ul><h2><i></i></h2><ul></ul><li><b><h3><ol></ol><", "h3></h3></h3><i></i></b></li></li><ol><u></u></ol>", "<p><h2><h1></h1><u><h1></h1><b></b></u></h2><h1></", "h1><h2></h2></p><ul><b></b><p></p><ol></ol><li><i>", "<ul></ul></i></li></ul><p></p></h2><html><h1><p><h", "tml><u></u><i></i></html><u></u><ol></ol></p><u></", "u></h1><u><b><ul></ul><li><u></u><i></i></li><u></", "u></b><ol><u><b></b></u></ol><h1></h1></u><html><h", "3></h3></html><h2></h2><b><i></i></b></html><html>", "<ol><h3><h1><u></u></h1><b><ul></ul></b></h3><h1><", "/h1><p><ol></ol></p></ol><ul><ul><u></u></ul></ul>", "<u><b></b></u><u></u><ul><li></li></ul><h1></h1></", "html><h1><p></p><b><html></html></b><h3></h3></h1>", "<h2><p></p></h2><html><b></b><ul></ul></html><i></", "i></html>" };
    assertEquals("intree 109", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case12() {
    String[] docA = { "<html><h2><h3><ol><b><b><u><h2><ol></ol></h2><ol><", "h2><li><b><ul></ul></b></li></h2></ol><u><h3></h3>", "<p><html><ol><p></p></ol></html><ul><h1></h1></ul>", "</p></u><ol><ol><ol><i></i><html><b><html></html><", "/b></html></ol><li></li></ol><html></html></ol><ul", "></ul></u></b><h3><html><i></i></html></h3><ol><p>", "<ol></ol></p><u><ul><h1><ol></ol><ol></ol></h1></u", "l><ol></ol><b></b></u><i><ul></ul><li></li></i><i>", "<h1></h1></i><h3></h3></ol><h3></h3></b><b><b><h3>", "<b></b><u><h3></h3></u><ol></ol></h3><h1><i><b><ht", "ml></html></b></i><p><ol></ol></p><h3><p><h2><p></", "p></h2><li></li></p><html><html><u></u></html><i><", "/i></html><p></p></h3><p></p><h2></h2></h1><ol><li", "><b></b><h1></h1></li><h2></h2><html></html></ol><", "ul><li><u></u><h1></h1></li><h3><u><ul><b><h3></h3", "></b></ul></u><li></li></h3><u><h2></h2></u></ul><", "b><u></u><h2></h2><b></b></b><u><ol></ol></u><html", "><ol></ol><li></li></html></b><ul><h1></h1></ul><p", "><ol></ol><ol><li></li></ol><h3></h3></p><ol><ol><", "/ol><h1><b><i></i></b><b></b><b></b></h1><p></p><o", "l><ol></ol></ol><h2></h2></ol></b><ol><h3><h3><p><", "/p></h3><h1><u><li><html><ul></ul></html></li><b><", "i><b></b></i><i></i></b></u></h1></h3><h3></h3><ht", "ml><u></u></html><b><h1><i><u></u></i><ol></ol></h", "1><h1></h1></b></ol><h1><u><i><li></li></i><li><u>", "</u></li><ol></ol></u><ol><ul><ol><html></html></o", "l></ul></ol><p><ul></ul></p></h1><li><html></html>", "</li><p><p><h2></h2><p></p><h3></h3></p><li></li><", "ol></ol></p><ul></ul><ul></ul></ol><b><u><ul></ul>", "<h1><ol><h2></h2></ol><html></html><b></b></h1><h3", "></h3></u></b><h3><u><h3><ol></ol></h3><li><html><", "/html></li><ul><h1></h1></ul><ul></ul></u></h3><p>", "</p><h1></h1></h3><i><h1><ol><b><p></p></b></ol><b", "><h2></h2></b></h1><h2><h1></h1></h2><b><b></b></b", "><h1><p></p></h1></i><h1><ul><i><li><li></li></li>", "<h3><html></html></h3><u></u></i><p></p><ul></ul><", "/ul><u></u><ul><ul></ul></ul><b></b><p></p></h1><p", "><h1><ol><ol><ul><ul></ul></ul></ol><i><u></u></i>", "</ol><u></u><ol><ul><b></b><h1><html></html></h1><", "/ul></ol><h3><html></html></h3></h1><ol></ol></p><", "p></p><html><u><b></b><h3></h3><li></li></u><h1></", "h1></html><h1><i><h3><i><ol></ol></i></h3></i><ol>", "</ol></h1><h2><ul></ul></h2></h2><li><i><i><html><", "/html></i></i><b></b><ol><h1></h1></ol><i></i><ul>", "</ul></li></html>" };
    String[] docB = { "<html><h2><h3><b></b><h3><u><li><html></html></li>", "<ul><h1></h1></ul></u></h3><p></p><h1></h1></h3><i", "><h1><ol><b><p></p></b></ol><b><h2></h2></b></h1><", "h2><h1></h1></h2><b><b></b></b><h1><p></p></h1></i", "><p><h1><ol><ol></ol><i></i></ol><u></u><h3><html>", "</html></h3></h1><ol></ol></p><p></p><html><u><b><", "/b><h3></h3></u><h1></h1></html><h1><i></i><ol></o", "l></h1></h2></html>" };
    assertEquals("outtree 214", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case13() {
    String[] docA = { "<html><u><p></p><html></html><ul><h3></h3></ul></u", "><li><u><h2><p></p></h2></u><h2></h2></li><i></i><", "ul></ul><h2></h2><h3></h3></html>" };
    String[] docB = { "<html><h3></h3><h3><h3><ul></ul></h3></h3><ol></ol", "></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case14() {
    String[] docA = { "<html><ol><ul><u></u><b><i></i><h2></h2></b><ul></", "ul></ul></ol><h2></h2><h3><u><h2><b><li></li></b><", "i><html></html><h2></h2></i><li></li></h2><ul></ul", "></u><li><i><li><b></b></li></i></li><h3><html><h3", "></h3></html><html></html></h3><h1></h1></h3><b><p", "><h2></h2></p><h3><h1></h1></h3><html></html></b><", "h1><b><b></b></b></h1><html></html></html>" };
    String[] docB = { "<html><h2></h2></html>" };
    assertEquals("outtree 36", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case15() {
    String[] docA = { "<html><i><li><h1><i></i></h1><ol><i></i></ol><li><", "/li></li><h2><li><b></b></li><ul><i></i></ul><li><", "b></b><ol></ol></li><html><h1></h1><i><h3><li></li", "></h3></i></html><h1><i><h2><b></b><li></li></h2><", "h2></h2></i></h1><u><ol></ol><li></li></u></h2><i>", "<h3></h3><html></html></i><ol></ol></i><u><b><u><b", "></b></u></b></u><ul><h2></h2></ul></html>" };
    String[] docB = { "<html><i><li><h1><i></i><h1><b><b><u></u><u></u></", "b></b></h1></h1><ol><i></i></ol><h3><li></li><li><", "/li></h3><li></li></li><h2><li><ul><u><ol><li><ul>", "<b><b><h1></h1><ol></ol></b><html></html></b></ul>", "</li></ol><i></i></u><p><html></html></p><ol><h2><", "h3></h3><u></u></h2></ol><html></html><h1><ol></ol", "></h1></ul><b></b><ol></ol></li><ul><b></b><i></i>", "<p></p><ul></ul></ul><li><i><h1><ol></ol><ol><u></", "u></ol></h1></i><b></b><ol></ol></li><html><h1><h1", "></h1></h1><i><ul></ul><h3><li></li></h3><ol><h2><", "/h2></ol></i></html><h1><i><h2><b></b><li></li></h", "2><h2></h2></i></h1><b><h1><li><ul><li></li></ul><", "/li><h1></h1><ul></ul></h1><li></li></b><u><ol></o", "l><li></li></u></h2><i><h3><ul><i><b><u></u></b></", "i></ul></h3><p><ul><b><u><u></u></u></b><html></ht", "ml></ul><h2><li></li></h2></p><html></html></i><p>", "<ul><h1><html></html><h1></h1></h1></ul><html><ul>", "<h1><h3></h3><u></u></h1><ol><h2><html></html></h2", "><p></p></ol></ul><i></i></html></p><ol><h2></h2><", "/ol></i><i><h1><h2><h3></h3><h3></h3><li></li></h2", "><b></b><ol></ol></h1><h2><html><h1></h1></html><l", "i></li></h2><b></b><h2></h2></i><u><b><u><b></b></", "u></b></u><h2></h2><ul><h2></h2></ul></html>" };
    assertEquals("intree 92", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case16() {
    String[] docA = { "<html><h3><html></html><h3></h3></h3><html></html>", "</html>" };
    String[] docB = { "<html><h3><p><ul></ul></p><h1><h3><i><ul><ul></ul>", "</ul></i></h3></h1><h2><p><li><h1><b></b></h1></li", "></p></h2></h3><li><li><ul></ul></li></li><i><h1><", "h1></h1><b></b><li></li></h1><h2><h3><li></li></h3", "></h2><li></li></i><u></u></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case17() {
    String[] docA = { "<html><u><h3><ol><h2><u><p><p></p></p><li></li><h2", "></h2></u><ul></ul></h2><ul><p><h1></h1><li></li><", "/p><h1><i></i></h1><u></u></ul><html><ul><ul><html", "></html></ul></ul><u><i></i></u><b></b></html><u><", "h1><u><h2></h2></u></h1><h1></h1></u><li><li></li>", "</li><b></b></ol><b><i></i></b><b><li><ol></ol></l", "i><h2><ul><li></li></ul></h2><h2></h2></b><li></li", "></h3><h1><i><ul><h2></h2><li><li></li><i></i></li", "></ul><h2></h2><html><li></li></html></i><h2><p></", "p><i><li></li><ol></ol></i><p><h3></h3></p></h2></", "h1><h1><ul><html></html></ul></h1><i></i></u><ul><", "h1><ol></ol><ol></ol></h1><b><u><h2><ol><h2></h2><", "/ol><html></html></h2><u></u><h1></h1></u></b></ul", "><ol><u><html><h1><ul><html></html></ul><html><h1>", "</h1></html></h1><ol></ol></html></u><ol><li><h1><", "ul></ul><i></i><ul></ul></h1></li></ol><p><html></", "html></p><h1><h3></h3><u></u><h2><u></u><h1></h1><", "/h2></h1><h1></h1></ol><ul></ul></html>" };
    String[] docB = { "<html><u><h3><ol><h2><html><p></p><b><u></u></b></", "html><u><p><p></p></p><li></li><h2></h2></u><ul></", "ul></h2><ul><h1><h3><p><ol></ol></p></h3><b><h3></", "h3></b><ul></ul><html></html></h1><p><h1></h1><li>", "</li></p><h1><i><u></u></i></h1><u></u></ul><html>", "<ul><ul><html></html></ul></ul><u><i></i></u><b></", "b></html><u><h1><u><h2></h2></u></h1><i><u></u><h3", "></h3></i><h1></h1></u><li><li></li></li><b></b></", "ol><b><i></i></b><b><li><ol></ol></li><h2><ul><li>", "</li></ul></h2><h2></h2></b><li></li></h3><h1><i><", "ul><h2></h2><li><li></li><i></i></li></ul><h2><h2>", "<u><u></u><i></i></u></h2><u><u><ol><p></p></ol></", "u><li></li></u></h2><html><li></li></html></i><h2>", "<p></p><i><li></li><ol></ol></i><p><h3></h3></p></", "h2><b></b></h1><h1><p><i><h2></h2><html><h1><li><i", "><u></u></i></li><h3></h3></h1></html><html></html", "></i><h2><u></u><h2><b></b></h2></h2></p><ul><html", "></html></ul><u><b><h2></h2></b></u><h1></h1></h1>", "<i></i></u><ul><h1><ol></ol><ol></ol></h1><b><ul><", "i><p><html></html></p></i><b><i></i></b></ul><u><h", "2><ol><h2></h2></ol><html></html></h2><u></u><h1><", "/h1></u></b></ul><ol><u><html><h1><ul><html></html", "></ul><html><h1></h1></html></h1><ol></ol></html><", "/u><ol><li><h1><ul></ul><i></i><ul></ul></h1></li>", "</ol><p><html><b></b></html></p><h1><h3></h3><u><i", "></i></u><h2><u></u><h1></h1></h2></h1><h1></h1><o", "l><h2><ol></ol></h2></ol></ol><ul></ul></html>" };
    assertEquals("intree 55", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case18() {
    String[] docA = { "<html><i><p><h2><h2></h2><p></p></h2></p><ul></ul>", "<ul></ul></i><b><h3><h2><b></b><h2><u><li><h3><ul>", "</ul><b></b></h3><i></i><h2><h3></h3></h2></li></u", "></h2></h2><html><li></li><ol><h1></h1></ol><i></i", "></html><h1><ol></ol></h1></h3><h1><ul><li><h1></h", "1></li><html><ul></ul></html><u></u></ul></h1><ul>", "<h1><h1><h2></h2><h1><h1></h1></h1></h1><h3><b><b>", "</b></b></h3></h1></ul><html><li></li></html></b><", "h3></h3></html>" };
    String[] docB = { "<html><h3></h3></html>" };
    assertEquals("outtree 45", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case19() {
    String[] docA = { "<html><u><html></html><ul><h2></h2></ul><h3><li><l", "i><li><u><h1></h1><h3></h3></u></li><h1></h1></li>", "</li><i></i></h3><ul></ul></u><h1><li><ol></ol></l", "i><h1><p></p><li></li></h1></h1><h3></h3><h3></h3>", "<ul></ul><ul></ul></html>" };
    String[] docB = { "<html><ol><h2><ul><html><h2></h2></html><li><ol><u", "l></ul></ol><h1><ol></ol></h1></li><b></b></ul><h2", "><ol></ol><html></html></h2><p></p><i></i></h2><ul", "><b></b><h2></h2><li></li></ul><i><li></li></i></o", "l><p></p><ul></ul></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case20() {
    String[] docA = { "<html><h3><ol><ul><u></u><ol><h3></h3></ol><i></i>", "</ul><ul><html></html><u><u></u></u><ol></ol></ul>", "<h3></h3></ol><h3><h2><ol><i><ul></ul></i></ol><h3", "><u></u></h3><li></li><li></li></h2><u><p></p></u>", "</h3><ol><u><h2><li></li><h1></h1><i></i></h2><h1>", "</h1><li></li></u><p><u></u><i></i><ul></ul></p><b", "><h2><ol></ol></h2><ul><ol><html></html></ol></ul>", "</b><ol></ol></ol><ul><h1></h1></ul><b><h1></h1><h", "tml><u></u></html><h2></h2></b><b><h2></h2></b><ol", "></ol></h3><html><li><h2><ul><ol><b></b></ol><ul><", "h2></h2></ul><u></u><html><u><html></html><ol></ol", "></u></html></ul><li></li><html><ol></ol><h1></h1>", "</html></h2><html><i><u><ul></ul><li><li></li><htm", "l></html></li><b><p><h2></h2><ol><h3></h3></ol></p", "></b></u><i><html></html><li></li></i></i><i><ol><", "p><i></i></p></ol><h2></h2><b></b></i><p><h1></h1>", "<ol><ol></ol></ol><p></p></p><h3><h3></h3></h3><li", "></li><ol></ol></html><i><li><ol><ol></ol></ol><i>", "<li><u></u></li><html></html></i><ul><b><h2><ol><u", "l></ul><h1></h1></ol></h2><ul><li></li></ul></b><u", "></u><li></li><b></b></ul><h3></h3></li><p><h2><h2", "></h2></h2><html><h2><h1><li></li></h1></h2><html>", "</html></html><html></html><ol><h2><h2><h1><li></l", "i></h1><h3></h3><p></p></h2></h2><h1></h1></ol></p", "></i><p></p><i><i><i></i><u></u></i></i><li></li><", "ol><b></b></ol><ul></ul></li><ol><h1><h2><h3><ul><", "ul><p><b></b></p><h3></h3><li><ol><b></b></ol><h1>", "<i></i></h1><h2></h2><h1></h1></li><li></li><b></b", "></ul><h3><h3><ul><ol><u></u></ol><h3><h2></h2></h", "3></ul><li></li></h3></h3><h3><ol></ol></h3><ol></", "ol><i></i></ul><u><u></u></u><h2><ol></ol><html></", "html><u></u><i><b></b></i></h2><html></html></h3><", "u></u><ol><html></html></ol></h2><html></html></h1", "><h2><h2><ul></ul></h2><h1></h1></h2><h1></h1></ol", "><ul><b><ul></ul></b><li><h1><ul></ul></h1><p></p>", "<h3><li><h2></h2><h1></h1></li><i></i></h3></li><o", "l><li><li></li><i><b></b></i></li><h1></h1></ol><b", "></b><u><p></p></u><html></html></ul><i><h3></h3><", "/i></html><h3><ul><b></b></ul><ul><li><b></b><ol><", "ul></ul></ol><html></html><i></i></li><h3></h3></u", "l><p></p></h3><i><html><i></i></html><h3><html><p>", "<p><h3></h3></p><ol><h3></h3></ol><h1></h1><h1></h", "1></p><li><html></html></li></html></h3></i><ol><l", "i></li><h2><u></u></h2></ol><h2></h2><ol></ol><b><", "/b></html>" };
    String[] docB = { "<html><h3><ol><ul><u></u><ol><h3></h3></ol></ul></", "ol><h3><u><p></p></u></h3><ul><h1></h1></ul><b><h2", "></h2></b><ol></ol></h3><html><li><p></p><i><i><i>", "</i><u></u></i></i><ol></ol></li><ol><h1><h2><h3><", "ul><ul><p><b></b></p><h3></h3><li><ol><b></b></ol>", "<h2></h2><h1></h1></li><li></li><b></b></ul><h3><h", "3><ul><ol><u></u></ol><h3><h2></h2></h3></ul><li><", "/li></h3></h3><h3><ol></ol></h3><ol></ol><i></i></", "ul><h2><html></html><u></u><i><b></b></i></h2></h3", "><u></u><ol><html></html></ol></h2><html></html></", "h1><h2><h1></h1></h2><h1></h1></ol><i></i></html><", "h3><ul><b></b></ul><ul><li><b></b><ol><ul></ul></o", "l><html></html><i></i></li><h3></h3></ul><p></p></", "h3><i><html></html><h3></h3></i><ol><li></li><h2><", "u></u></h2></ol><h2></h2></html>" };
    assertEquals("outtree 168", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case21() {
    String[] docA = { "<html><h1></h1></html>" };
    String[] docB = { "<html><li><p><ul><p><ul><b><i></i></b><i></i><h2><", "/h2></ul><h1></h1><ol></ol></p></ul></p><u><u><ul>", "</ul></u></u><h1><u></u></h1><h2><u><ul></ul></u><", "/h2><h1><p><b><b></b></b><p></p></p><ul><h3></h3><", "/ul><li></li></h1><u></u><h1><h2></h2></h1><u></u>", "</li><h2><ol></ol><p></p></h2><p></p><p><h2></h2><", "/p><h1></h1></html>" };
    assertEquals("intree 37", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case22() {
    String[] docA = { "<html><p><ul></ul></p><p><h3></h3></p><html><b></b", "></html></html>" };
    String[] docB = { "<html><h3><b></b><b></b></h3><ul><i></i></ul></htm", "l>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case23() {
    String[] docA = { "<html><b><p><ol></ol><p><u><i></i><ol><u></u></ol>", "</u><u></u><h3></h3><html></html></p><ol></ol><ol>", "<u></u></ol></p><li><ul></ul></li><b></b><h2></h2>", "</b><html></html><i></i></html>" };
    String[] docB = { "<html><b><p><ol><i><li></li><ul><b></b><ul></ul><i", "><u></u></i></ul><b><ul><i><li><h3></h3></li><ul><", "ol></ol></ul></i><ol><h3><h2></h2><i></i><h2></h2>", "</h3></ol><h3></h3></ul></b><u></u><h3></h3></i><l", "i></li></ol><p><u><html><ul></ul></html><i></i><ol", "><u></u></ol></u><u></u><h3></h3><html></html></p>", "<ol><li><h2></h2><u><ol><h3></h3></ol></u></li></o", "l><h1><h2><ul></ul></h2></h1><ol><u></u></ol></p><", "h2><li><h1></h1></li><u><h3></h3></u></h2><u><h2><", "/h2><h3></h3></u><li><html><li><li></li></li><ol><", "/ol></html></li><li><ul></ul></li><b></b><h2></h2>", "</b><p><b><html><ol></ol><h2><u><ul></ul></u></h2>", "<p></p><ul></ul></html><h3><p><ol><h2><b></b></h2>", "<b></b><h2></h2></ol><b><ol><h1></h1></ol></b></p>", "<li><i></i></li><h1></h1><h1><b></b></h1><h3></h3>", "</h3><u></u></b><h1><html><ul><h3><ul></ul></h3></", "ul></html><h1><li><html><u><p><i><b></b><html><htm", "l><ul><li></li></ul><u></u></html><u></u></html></", "i><i><b></b><h3></h3></i><ol><li></li><ul></ul></o", "l></p><u><p></p><u></u></u><ol></ol><p><html><li><", "/li></html></p></u><ul></ul><b></b><ul><i><h2></h2", "></i><h1></h1></ul><i><li></li></i></html><h3><htm", "l><li></li></html><ol><p><b></b></p><b></b></ol><b", "></b></h3><h1><html></html></h1><i></i></li><li><h", "3></h3></li></h1><i><i><i><h2><u><li><h2></h2></li", "></u></h2></i></i><ul><p><html></html></p><u></u><", "/ul></i><i><u></u></i><li></li></h1><li><p><p></p>", "<html></html><html></html></p><p><p></p></p><i></i", "></li><i><h3><html><i><h1><ol><li></li></ol><html>", "<i></i></html><html><h2></h2></html></h1></i></htm", "l><p></p></h3><u></u></i><u><h1></h1><html></html>", "<i><b></b></i></u><h1><h1></h1></h1></p><html><b><", "h3></h3></b><li><u></u><ol></ol><u></u></li><h2></", "h2><p><h3></h3></p></html><li><u></u><h1><ol></ol>", "</h1><b></b></li><ol><h1><h2><h2><p></p></h2></h2>", "<p><h3></h3></p></h1></ol><i></i></html>" };
    assertEquals("intree 187", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case24() {
    String[] docA = { "<html><u><ul><h1><ul><u><b></b><p><p><li><u></u><h", "3></h3></li><u><li><h3></h3></li><ol></ol><u></u><", "/u><b><b></b><h2></h2></b></p><p></p></p><i><html>", "</html><li></li></i><html></html></u><html><ol><h1", "><h1></h1><p></p></h1></ol><ol></ol></html></ul><u", "l></ul></h1><i><h1><b><i><ol></ol><h3><h2></h2><i>", "<u></u></i></h3></i><h2></h2></b><h2><i><ol><p><h2", "><ul></ul></h2><b><li><li></li></li></b></p><ul></", "ul><h3></h3></ol><i><p></p><h2><html></html><h3></", "h3></h2><b><i><h2></h2></i><u></u></b><ul><ul></ul", "><html></html></ul><ol><p></p></ol><i></i></i></i>", "<ul><p></p></ul></h2><ul><li></li></ul><i><h1></h1", "></i></h1><li><i><li></li><u></u><html><p><h1></h1", "><ol></ol><b><u><h2></h2></u></b></p><u></u><h1></", "h1><ul></ul></html><h3></h3><ul><h3></h3></ul></i>", "<u><h1></h1></u><u><ol><b><p></p></b></ol></u></li", "><ol><ol><li><html></html><ol><h1></h1></ol></li><", "h3></h3></ol><h2><h2></h2><p></p><ul></ul></h2><h3", "><ol></ol></h3><i><b></b><h1><i><h3></h3></i></h1>", "</i><html><u></u></html><ul><ol><h1></h1></ol></ul", "><li><p></p></li></ol><p><li></li></p><h3><ol><h3>", "<h1></h1></h3></ol></h3></i><li><b></b></li></ul><", "p><u><li><li><html><i></i><h3></h3></html></li><h3", "><h1><h1><ul></ul></h1></h1></h3><h2><h1></h1></h2", "><h3><u></u></h3><ol><h1></h1></ol></li><h3></h3><", "b><u></u><b><h2></h2><h1></h1></b><html></html></b", "></u><h1><p><li><html><h2></h2></html><ol><html></", "html></ol></li></p><u></u><b><h2><p><b></b><li></l", "i></p><h1><h1></h1><h1></h1></h1></h2></b><p></p><", "h2></h2></h1><h1><u><b></b></u></h1><u><li></li><u", "l><u></u></ul></u><ul><ol><h1></h1></ol></ul><h2><", "ul></ul><h2></h2><p><u></u></p><h2></h2><li></li><", "h2></h2></h2><h1><html></html><h2></h2></h1></p><b", "></b><ul></ul></u><html><h3><h3></h3><p><p></p></p", "></h3></html><li><p><h3></h3><h1><h3></h3><i><h1><", "/h1><u><p></p></u></i><li><h1></h1><i></i></li><h1", "></h1></h1><h2><h1><b></b></h1></h2></p><ol></ol><", "/li><ol></ol><li><i><h1><ul></ul></h1></i><i></i><", "b></b></li></html>" };
    String[] docB = { "<html><li><p><h3></h3><h2><h1></h1></h2></p></li><", "ol></ol></html>" };
    assertEquals("outtree 217", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case25() {
    String[] docA = { "<html><h3><h1><i><li><i><html></html></i></li><ul>", "</ul></i></h1></h3><b><p><p></p></p></b></html>" };
    String[] docB = { "<html><i><h3><u></u><ul><h3></h3><u></u><html></ht", "ml></ul></h3></i><ul><b></b><h2></h2><html></html>", "</ul><ul><h2><h1></h1><h2></h2></h2><b><u></u></b>", "</ul><u><u><li></li></u></u><html></html><html></h", "tml></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case26() {
    String[] docA = { "<html><html><h3><h2><u></u><h3></h3><ul></ul></h2>", "<html><u></u><p></p><h3><ul></ul></h3></html><b><p", "></p></b><h2><h2></h2><i></i></h2></h3><ul><ol><h2", "></h2><p></p></ol><u><u><h2></h2></u></u><ol><html", "><u><p></p><h3></h3></u><ol><ol><p></p></ol></ol><", "ul></ul></html><ul><b><h3></h3><ol></ol></b><i></i", "></ul><h3><p><html></html></p><html></html></h3><i", "><html><h2></h2><h1></h1></html><ol></ol><h3></h3>", "</i><p></p><h1></h1><b></b><h2></h2></ol></ul><ul>", "<html><p></p><ul><h3><h1></h1></h3><html></html></", "ul><u></u><h1></h1></html><html></html></ul><html>", "</html><p></p></html><i><i></i></i><u><ol></ol><li", "></li></u><ul></ul><p><h2></h2></p><h1></h1></html", ">" };
    String[] docB = { "<html><ul></ul><p><h2></h2></p></html>" };
    assertEquals("outtree 69", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case27() {
    String[] docA = { "<html><h2><b><p></p><li></li></b><ul><h1><ul><h3><", "/h3></ul></h1><h1></h1><u></u><h1></h1></ul><h2><h", "1></h1><h3></h3></h2><html><h1><h3></h3></h1></htm", "l></h2><ul><u></u><u></u><li></li></ul><h1><li><h2", "><i></i><b><html></html><i></i></b><i></i></h2><li", "></li></li></h1><h1><ul></ul><i><ul></ul></i></h1>", "</html>" };
    String[] docB = { "<html><html><h3><li></li><p><li><h3><ol></ol></h3>", "<html><ul></ul></html><html></html><p><h3></h3><li", "></li></p><ol><p><i></i></p><ol></ol><b></b><u><h1", "></h1></u></ol></li><b><h3></h3><b><ul></ul></b><b", "></b><b></b></b><h3><u></u></h3><ol><u></u></ol><i", "></i></p><ul><i></i><ol><h2><li></li></h2><li></li", "></ol><h3></h3><h3></h3></ul><h1><ul></ul></h1><p>", "</p></h3><b><b><i></i><p><b><h2></h2></b></p><i><h", "1><b></b></h1></i><ul><h1></h1></ul></b><i></i></b", "><h2></h2></html><h2><ol><u><p></p></u><h2></h2></", "ol><b><ul><u></u></ul><p><html></html></p><li><h1>", "<h1></h1></h1></li></b><ul><h1><ul><h3></h3></ul><", "/h1><h1><i><h2></h2><h1></h1><u></u></i></h1><u></", "u><h1></h1><ol><h1></h1><u></u></ol></ul><h2><h1><", "b><ul></ul></b></h1><h3></h3></h2><html><h2><h2></", "h2></h2><h1><h3></h3></h1></html><h1></h1><b></b><", "/h2><html><p><h1><h2><b><h2></h2></b></h2></h1><b>", "<p></p><p></p></b></p><h3><u></u><li></li><h2></h2", "></h3><b><html></html></b><i></i><li></li><u></u><", "/html><ul><u></u><u><h1></h1><h1></h1><h3></h3></u", "><u><ul></ul></u><li></li></ul><ol></ol><h1><h2><h", "1><p></p><ol><ol></ol></ol><li></li></h1><h3><i><h", "2></h2></i></h3><b></b><b></b></h2><li><h3><ul><h2", "><b></b></h2><p></p><h1><u></u></h1></ul><html></h", "tml><h2></h2></h3><h2><i><li><h1><ul></ul></h1></l", "i><p><html></html></p><h3><h3></h3></h3></i><b><ht", "ml></html><i></i></b><i><ol><b><p></p></b></ol><p>", "</p><i><li><h1></h1></li></i></i><h3><li><h2></h2>", "<b></b></li></h3></h2><li></li><html><li></li></ht", "ml></li><h3><h2><h1></h1></h2><p></p><u></u></h3><", "u><h3></h3></u></h1><h1><ul><h1></h1></ul><h2><h2>", "<p></p><ul><ol></ol><i></i></ul><b><b></b></b><u><", "p><i><b></b></i></p></u></h2></h2><i><ul></ul></i>", "<h1></h1></h1><h1><i><h1><i></i><html><u></u><li><", "/li></html><h3><h3></h3><li></li></h3><h1></h1><u>", "</u></h1><h3></h3></i><h1><ul><p><h2></h2></p><ol>", "</ol><li></li><i></i></ul><h3><li></li></h3><ul><u", "l><i></i></ul></ul><p></p></h1><b></b><u><u><u></u", "></u><h1></h1></u><h3></h3></h1><ul></ul><h3></h3>", "<u><h1></h1><html></html></u><h2></h2></html>" };
    assertEquals("intree 200", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case28() {
    String[] docA = { "<html></html>" };
    String[] docB = { "<html><ol><h2><b><h2></h2><ul></ul><h3></h3></b><u", "><b><h2><h1></h1></h2></b><i><li></li><h2></h2></i", "></u></h2><ul><ul></ul></ul><html></html></ol><h1>", "<li><i></i></li></h1><ol></ol></html>" };
    assertEquals("intree 20", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case29() {
    String[] docA = { "<html><h2><ul><ul><h1><li><h1></h1></li><p><li></l", "i></p></h1><ul><h1></h1></ul><h1></h1><h3></h3></u", "l></ul><i><h1><b><html><p></p><html></html><html><", "/html></html><h1><ol></ol><h2></h2></h1><u></u></b", "><i><u><ul><p><ol></ol><ul></ul></p></ul><h1><u><b", "><h3></h3></b></u><html><h2></h2></html><i></i></h", "1></u><html><li><ul></ul><h1></h1></li><h3><html><", "ul></ul><ul><li></li></ul></html><html></html></h3", "><li><ul></ul><ol><h1><ul></ul></h1><ul></ul><li><", "/li></ol></li></html><ul></ul></i><ul><h2></h2><ol", "><b></b></ol><h1></h1></ul><li><li><u><b><h1><u><l", "i></li></u></h1></b><i><i></i></i></u></li></li><b", "><h2><ol><ol></ol><b><ul></ul></b></ol></h2></b><b", "></b></h1><li><i><li></li><b></b><h3></h3></i><li>", "</li></li></i><h1><h1><p><u><b><b></b></b><html><b", "></b></html></u></p><html><p></p><li><h2></h2></li", "></html><h2></h2><html></html><ol></ol></h1></h1><", "ol><ol><h3><ul><b><i></i></b></ul><p></p><ol><p></", "p></ol></h3><ul><b></b></ul></ol><h3></h3><i></i><", "i><ol><h2></h2></ol></i></ol><li><html><b></b></ht", "ml></li><html></html><ul><h3></h3></ul><h3></h3></", "h2><ol><h3></h3></ol><p><ul><h3><i></i></h3><ul></", "ul></ul></p><ul></ul><ul></ul></html>" };
    String[] docB = { "<html><h2><u></u><ul><ul><h1><li><h1></h1></li><p>", "<li></li></p></h1><ul><h1></h1></ul><h1></h1><h3><", "/h3></ul></ul><i><h1><b><html><p></p><html></html>", "<html><ul></ul></html><li><h3></h3></li></html><h1", "><ol></ol><h2></h2></h1><u></u></b><i><u><ul><p><o", "l></ol><ul></ul><h1></h1></p></ul><h1><u><b><h3></", "h3></b></u><html><h2></h2></html><i></i></h1></u><", "html><li><ul></ul><h1></h1></li><h3><html><i><ol><", "h2></h2><ul></ul></ol><ol><i></i><h3></h3></ol><h2", "><ol></ol></h2></i><ul></ul><ul><li></li></ul></ht", "ml><html></html><ul><li><h1></h1></li></ul></h3><l", "i><ul></ul><ol><h1><ul></ul></h1><ul></ul><li></li", "></ol></li></html><ul></ul></i><ul><h2></h2><ol><b", "></b><u><b><p></p></b></u></ol><h1></h1></ul><li><", "h1><i><u></u></i><h3><html></html><h1></h1><ol><li", "></li></ol></h3><html><h3><p><h2><h2></h2></h2></p", "></h3><li><li><li></li></li></li></html></h1><li><", "u><b><h1><u><li></li></u></h1></b><i><i></i></i></", "u></li><html><ul></ul><h3></h3></html></li><b><h2>", "<ol><ol><h1></h1></ol><b><ul><u></u></ul></b></ol>", "</h2><i></i></b><b></b></h1><li><h2><ol><p><u><b><", "h1><h3></h3></h1></b><b></b></u></p><ul></ul><ol><", "/ol></ol><h1></h1><u><i><ul><u></u></ul><i><i></i>", "</i><i></i><p></p></i><i></i></u><html></html><h2>", "</h2></h2><i><li></li><b></b><h3></h3></i><li></li", "></li><u></u><h1></h1></i><h1><h1><p><h1></h1><u><", "b><b></b></b><html><b></b></html></u></p><html><p>", "</p><b></b><li><h2></h2></li></html><h2></h2><html", "></html><ol></ol></h1><li><h2></h2></li></h1><ol><", "ol><h3><ul><b><i></i></b></ul><p></p><ol><li></li>", "<p></p></ol></h3><ul><h3><i><li></li></i></h3><b><", "/b></ul><p><ol><ol></ol></ol></p></ol><h3></h3><h3", "><li><u></u></li><ul></ul></h3><i></i><i><ol><h2><", "/h2></ol></i></ol><li><html><b></b></html></li><ht", "ml></html><i><i></i></i><ul><h3></h3></ul><h3></h3", "></h2><ol><h1><li></li></h1><h3></h3></ol><p><ul><", "h3><i></i></h3><ul></ul></ul></p><ul><i></i></ul><", "ul></ul><h2></h2></html>" };
    assertEquals("intree 87", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case30() {
    String[] docA = { "<html><ul><h1><p><b><li><p></p></li><ol><h1><u><u>", "<html><ul></ul></html><ol></ol></u><h3></h3></u></", "h1></ol><h2><li></li><i><html></html></i><u><h2></", "h2></u></h2><b><i><ul><p></p></ul><ol><h1><html><i", "></i></html></h1><h2><b></b></h2><i></i><li><li></", "li></li></ol><h2><p><h2></h2><html></html></p></h2", "><h1></h1><b></b></i><u><i><i></i></i></u></b></b>", "</p><b><li><p><i></i></p><i><i></i></i><p><p></p><", "/p><h2><ol></ol></h2></li><h1><html><b><h3></h3></", "b></html><b></b><html></html></h1><h1><h2></h2><ht", "ml></html></h1><h1><u></u></h1></b><h1></h1><li><u", "l><h2><html><h2></h2></html></h2><b><ol></ol></b><", "h3></h3><u></u></ul></li><b><u></u><u></u></b><htm", "l></html></h1><b><html><ul></ul><b><h2></h2></b><h", "1><h2></h2><h3></h3></h1></html><p></p></b><b><h3>", "<li></li><html></html></h3><h2><i></i></h2></b><h3", "></h3></ul><p><i><h3><i><i></i><u><ol></ol></u><u>", "</u></i><h1></h1><li><html></html></li><p><h1><li>", "</li></h1></p></h3><h3><html><html></html></html><", "/h3><html></html><h1></h1></i><html><h3><html></ht", "ml><ol></ol></h3><h2></h2></html><li></li><p></p><", "li><ul></ul></li></p><h3><li><ul><ul><li><ol></ol>", "</li></ul><h2><ol><b><h3><h1></h1><h2></h2></h3><h", "1></h1><p><p></p></p><li><ol></ol><h3></h3></li></", "b><html></html></ol><html><b></b><i><i></i></i></h", "tml><i><h2><h2></h2></h2><ul></ul></i><html><p></p", "></html><p></p></h2><li><h3><li></li><li></li></h3", "><li></li></li></ul><li><i><b><ol><p></p></ol></b>", "</i><ol></ol></li><ol></ol><h3><ol></ol></h3></li>", "<h3><b><i><p><ol><h3></h3></ol></p><u><h3><i></i><", "/h3></u><ol></ol><html></html><i><i></i></i></i><h", "1></h1><p></p></b><u><i><html></html></i></u><h3><", "i><p></p><h1></h1><b></b></i><i><ul></ul><u><h2></", "h2><h2></h2></u></i><ul><p></p></ul></h3></h3><h3>", "<h3></h3><ol><p></p></ol><li><ol></ol><li></li><h1", "></h1></li><h1><h2><h3></h3></h2></h1></h3></h3><i", "><u><ol></ol><li><ol><i></i></ol><h1></h1></li><i>", "</i><html></html></u><html><h3><h1><h2><h1></h1></", "h2><h2><h2></h2></h2></h1><i></i><b><h3><h1></h1><", "/h3></b><ol><html><ol></ol></html></ol></h3><ol><i", "></i></ol><u></u><u><b><ol></ol></b></u></html></i", "><html><p><b></b></p><h3></h3><i></i></html><li><h", "3></h3><ol><li><ol><p></p><p></p></ol></li><h3></h", "3></ol><ul><i></i><i><ol></ol></i></ul><h1></h1></", "li><h3></h3><b><p></p></b><h3></h3></html>" };
    String[] docB = { "<html><ul><b></b><h3></h3></ul><p><html><h2></h2><", "/html><li></li></p><i><html><h3><h1><h2><h1></h1><", "/h2></h1><ol></ol></h3><ol><i></i></ol><u></u><u><", "b><ol></ol></b></u></html></i><html><p><b></b></p>", "<h3></h3><i></i></html><li><h3></h3><ul><i></i></u", "l></li><h3></h3><h3></h3></html>" };
    assertEquals("outtree 226", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case31() {
    String[] docA = { "<html><i><i><h2><b></b></h2></i></i><ol><h3></h3><", "u><u></u><i><h1></h1></i></u><ol></ol></ol><li></l", "i></html>" };
    String[] docB = { "<html><i><h3><h3></h3></h3></i><i><ol><html></html", "></ol><li></li></i><ul><h3><u></u><i></i></h3><h3>", "</h3></ul><li></li></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case32() {
    String[] docA = { "<html><li><i><ol><html></html><h2><u></u><h1></h1>", "</h2><i><html><i></i></html></i></ol></i><li><u><l", "i></li><b></b><ol></ol></u><h3><ul><ul><i><h2><ol>", "</ol></h2></i><u></u></ul><ol></ol><li><u></u></li", "></ul><h3></h3><ul></ul></h3><html><u><h2></h2></u", "><ul></ul></html><ol><b><u><h3></h3><ol><i><p><h1>", "</h1><u></u></p></i></ol><h1></h1></u></b><b></b><", "b><b><p></p><h3></h3></b><p></p></b></ol><u><ul></", "ul><h2></h2></u></li><ol><b><u><h1></h1><ul><i></i", "></ul></u><p><h1></h1><h1></h1></p></b><h1></h1><l", "i></li></ol></li><p><ol></ol></p></html>" };
    String[] docB = { "<html><li><i></i><ol><b><u></u></b><li></li></ol><", "/li><p></p></html>" };
    assertEquals("outtree 56", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case33() {
    String[] docA = { "<html><h2></h2><p></p></html>" };
    String[] docB = { "<html><ul><h1><b><p><b></b></p><h1><u><li></li><ht", "ml><ol></ol></html></u><html><html><html></html><h", "tml></html></html><h1></h1><ul></ul></html><h3><ht", "ml></html><b></b></h3></h1><ul><ul></ul><ol><h3><u", "l><i></i><p></p></ul><h1><h2></h2><h3></h3><u></u>", "</h1></h3><b><ol></ol><h1></h1></b><h3></h3></ol><", "li><html></html><i></i></li><h1><html></html><h3><", "u></u><h1><u></u></h1><b></b></h3><h2><html><h1><h", "tml></html></h1></html></h2></h1></ul><p><html><h3", "><u><html></html></u><h2></h2></h3></html><html></", "html><html><li><li><p><h3></h3><i></i></p><li><li>", "</li><p></p><h2></h2><p></p></li></li></li><p></p>", "<ul><h2></h2><ul><html></html></ul><h3><p></p></h3", "><p><ol><h1></h1></ol></p></ul><p></p></html></p><", "u><h2><li><h2></h2></li><p></p></h2><p><i></i><h1>", "<b><ul></ul></b><p><p></p><p></p><h1></h1></p><li>", "</li></h1></p><b><h2><ul><ol></ol><b></b></ul><u><", "/u><ul></ul></h2><ol><h1><u></u></h1></ol></b><h2>", "<h1></h1></h2><i><ol></ol></i><ol><h3><html></html", "></h3><h2></h2></ol><li></li></u><h3><ol></ol><li>", "</li></h3><h3><h2></h2></h3></b><p><h3><ul><u></u>", "<html></html></ul><b><b><h2><u></u></h2></b></b><p", "></p></h3><html></html></p><b><h3><h2><html></html", "><h3></h3></h2></h3><ol></ol></b><i></i></h1><html", "><li><h3><html></html><h3></h3></h3><h3><i></i></h", "3></li><li></li><li><h1><html><ol></ol></html><h3>", "</h3></h1><html><i></i></html><ul><i></i></ul></li", "><h2></h2></html><h2><h1></h1><ol><h1><h3><li></li", "></h3><h1></h1></h1><b></b></ol><b><h3><b></b><htm", "l></html></h3><ul><li><u><li><u></u></li></u><b><h", "tml></html><h2><b></b><u></u></h2><p><ol></ol><li>", "</li><h2></h2></p></b><ol><i></i></ol><ul></ul></l", "i><h1></h1></ul></b><ul></ul><i></i></h2><u></u><o", "l><li></li></ol><p></p><li></li></ul><ul></ul><h2>", "</h2><p></p></html>" };
    assertEquals("intree 190", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case34() {
    String[] docA = { "<html><p><b></b><h2><li><u></u><u></u></li><p></p>", "</h2></p><ol><u><p><ol></ol></p></u><html></html><", "/ol><h2></h2><ol><p></p></ol></html>" };
    String[] docB = { "<html><u><h2><ul></ul><h1><i></i></h1></h2></u><h2", "></h2><html></html></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case35() {
    String[] docA = { "<html><html><html><u></u></html><ol></ol></html><b", "></b></html>" };
    String[] docB = { "<html><p><html><h2><h3><li><ul></ul><h2><p></p></h", "2></li></h3><h3><i><h1><ol></ol></h1><html><u></u>", "</html><i></i></i><h2><ul></ul></h2><html></html><", "/h3><i><p><h1></h1></p><html><ul></ul><h2></h2></h", "tml><ol><ol><li><h3></h3></li><li><b><h1></h1></b>", "</li></ol></ol><p></p></i></h2><h3><i><html></html", "></i><ol></ol><i></i></h3><li><h2></h2><b><ol></ol", "></b><p><html></html></p></li><li></li></html><h1>", "<u><p><u><h2></h2><h2><h2></h2></h2></u><u><p></p>", "</u></p><h2><h1><li><ol><h1><h1></h1></h1></ol><p>", "<b><ul></ul></b><h2></h2></p><u><p></p></u></li><p", "><ul><p><b><h3><html></html></h3></b></p><p><h3></", "h3><li><h2></h2><li></li></li></p></ul><html><u></", "u><html><ul></ul><p></p></html></html><p></p></p><", "li><ul><html></html><ol></ol></ul><li><html><i></i", "></html></li><p></p></li><h1><u><ul></ul><b><b></b", "><i></i><li></li></b></u><h3><ol></ol></h3></h1><h", "tml><h1><h2></h2></h1><li></li></html><h2><h1><ol>", "</ol><ol></ol></h1><p></p><ul><h1></h1></ul></h2><", "h2></h2><p></p></h1><ul><h3><u><ul></ul><html></ht", "ml><ul></ul></u><p></p><b><h3><h1></h1></h3><h3></", "h3><h3></h3></b></h3></ul><b><h3><li></li></h3><h2", "><p></p><ol><h2></h2></ol></h2><u></u></b><li><b><", "li><u></u></li></b><html><i><ul></ul></i></html></", "li><b><h2></h2></b></h2><p><i><li></li><h1></h1></", "i><li></li></p><p><h3><h1></h1></h3><h3><html></ht", "ml><li></li><i></i></h3></p></u><li><h1><ul></ul><", "/h1></li></h1><li><h3><li><ul></ul><h3><h1></h1></", "h3><li></li></li><h2><html><ol></ol></html></h2></", "h3><h2></h2></li></p><html><h3><h3></h3><u></u><ht", "ml><ol><b></b></ol></html><b><ol></ol></b></h3><ht", "ml><u></u></html><li><html><h3></h3><h3></h3></htm", "l><p><h2></h2></p><h1></h1><li></li><h2><u></u></h", "2></li><ol></ol></html><p><li><p><ul><li></li></ul", "><h1><h2><html></html><p></p></h2></h1><ul><ol><h2", "><i></i></h2></ol></ul><li></li></p><i><li></li></", "i><b><h3><html><li></li></html></h3><h2><ul></ul><", "/h2><b></b><ol></ol></b><h2><li><ol></ol></li><h3>", "</h3><h2></h2></h2><h3></h3></li><i><li><h1><html>", "</html></h1></li><i><h2></h2></i><p></p></i><p><h3", "></h3><ul></ul></p><ol><b></b></ol></p><b><b><li><", "/li></b><u></u></b><li><b><h2><ol><h2></h2><li></l", "i></ol><p></p><p></p><b></b></h2></b></li></html>" };
    assertEquals("intree 239", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case36() {
    String[] docA = { "<html><i><u><ol><u><ol><ul></ul><u><p></p></u></ol", "><li><h1><h1></h1><h3><u></u></h3></h1></li><h3></", "h3></u><ul><i><h1><ol><b></b></ol></h1><h3></h3><u", "l><ul></ul></ul></i><html><html></html></html><htm", "l><ol></ol></html><h3></h3></ul><u></u></ol><h1><i", "><ul><html></html></ul></i><i><b></b><h1></h1></i>", "<li></li></h1><h1></h1><li></li><b></b></u><ol><ul", "><b><h3><html><ol></ol></html></h3><h1></h1><h1></", "h1></b><html><li></li></html><h1><ul></ul></h1></u", "l><li><h1><li><h2></h2></li></h1><li></li></li><ul", "><li><ol></ol></li></ul></ol><ul></ul></i><b><ol><", "html></html></ol><u></u></b><h2><h3><ul></ul></h3>", "</h2><b></b><i></i></html>" };
    String[] docB = { "<html><i><u><ol><u><ol><ul></ul><u><p></p></u></ol", "><li><h1><h3><u></u></h3></h1></li><h3></h3></u><u", "l><i><h1><ol><b></b></ol></h1><h3></h3><ul></ul></", "i><html><html></html></html><html><ol></ol></html>", "<h3></h3></ul><u></u></ol><h1><i><ul></ul></i><i><", "b></b><h1></h1></i><li></li></h1><h1></h1><li></li", "><b></b></u><ol><ul><b><h3><html><ol></ol></html><", "/h3><h1></h1><h1></h1></b><h1><ul></ul></h1></ul><", "li><h1></h1><li></li></li><ul><li><ol></ol></li></", "ul></ol><ul></ul></i><h2><h3><ul></ul></h3></h2><b", "></b><i></i></html>" };
    assertEquals("outtree 11", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case37() {
    String[] docA = { "<html><p><h1><i></i><li></li></h1><html><u><ul><ul", "></ul></ul></u><i></i><h1></h1></html></p><h2></h2", "></html>" };
    String[] docB = { "<html><i><u></u><ol></ol></i><u><ul><u><i></i></u>", "</ul><h2><h2></h2></h2><html><ol></ol></html></u><", "ul><html></html></ul><ol><li><html></html></li><ht", "ml><ul><li></li></ul><h1></h1><i></i></html><li></", "li><ul></ul></ol></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case38() {
    String[] docA = { "<html><u><u><h3><b><html></html></b><p><i><b></b><", "/i><p><h2><p></p></h2></p><u><ol></ol></u></p><h2>", "</h2></h3><html></html></u><u><h3></h3><b><h1></h1", "><h2><ol></ol></h2><ol></ol></b><li></li></u><h1><", "html></html><html><h1><p><html><p><ol></ol></p></h", "tml></p></h1><html></html><ul></ul></html><h2><h1>", "<html></html></h1></h2></h1><ol></ol></u><u><ul><i", "></i><u><i></i></u></ul><b></b></u><h1><u><h3><u><", "html><li></li><h2><html></html></h2><u></u></html>", "<h3></h3><ol></ol></u><h3></h3><h1><i></i></h1><h1", "></h1><h2></h2><h2></h2><b></b></h3><li></li></u><", "h3><u><b></b><u></u></u><ul><h1></h1></ul><i><i></", "i></i><i><h3><ul></ul></h3></i><ol></ol></h3><h2><", "li><li></li></li><html><b><u></u><h3></h3><b></b><", "/b><p><h1></h1><h3></h3><ol></ol></p><ol><i></i></", "ol></html><ol><h3></h3></ol><html><h3><ol><u><ol><", "/ol></u></ol></h3><html><ol></ol></html></html><ul", "></ul><ol></ol></h2><h3><b><i></i><b></b><h3><b></", "b></h3></b><html><ol></ol></html></h3></h1><h3><h2", "><p><p></p><h1><u></u><p></p></h1></p><html><u><ht", "ml></html></u><u></u></html></h2><h3></h3></h3><ht", "ml><h2><h1></h1></h2></html><b><ol></ol><ol></ol><", "/b></html>" };
    String[] docB = { "<html><u><h1><html></html><html></html></h1><ol></", "ol></u><u><b></b></u><h1><h3><html></html></h3></h", "1><h3></h3><html><h2><h1></h1></h2></html><b></b><", "/html>" };
    assertEquals("outtree 110", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case39() {
    String[] docA = { "<html><h1><h2><html><h2></h2></html></h2><ul></ul>", "</h1></html>" };
    String[] docB = { "<html><h1><b><html></html><h3></h3></b><p><i><i></", "i></i><h3><u></u></h3><u><u></u><i></i></u><ul><i>", "</i></ul></p><h2><html><h2></h2><h3><b><h3></h3></", "b></h3><h1></h1></html></h2><ul></ul></h1><ol><i><", "i><b><h3></h3><h1></h1></b><li></li></i><h3><b></b", "></h3></i><h3></h3></ol><h2></h2><i><h3></h3></i><", "/html>" };
    assertEquals("intree 30", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case40() {
    String[] docA = { "<html><html><h3><b><b></b></b><ul><h2></h2></ul></", "h3><h2></h2></html><b><ol><u></u></ol></b><h3><i><", "h1><ol><h3></h3></ol></h1></i></h3><html><u><u></u", "></u><ol></ol></html><b><html><h3></h3><h3></h3></", "html></b><html></html></html>" };
    String[] docB = { "<html><p><h2><i></i></h2></p><u><ol></ol></u><ul><", "h2><u></u><i><li><i></i></li></i></h2><ul></ul></u", "l><h3><h1><b><html></html></b><i><html></html></i>", "</h1></h3><u><h3></h3></u></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case41() {
    String[] docA = { "<html><ul></ul><html></html><ul><ul></ul></ul></ht", "ml>" };
    String[] docB = { "<html><ul><h2><h1><li><p><li><p></p></li><h3></h3>", "<ul></ul></p><html></html></li><u><i><i><u></u></i", "><u></u></i></u><ol></ol></h1></h2><h3><p><html><h", "2></h2></html></p></h3><u></u><b></b><html><ul></u", "l><ol></ol></html><h2></h2><i></i></ul><html><ol><", "h1><h1><h3><li><p></p></li><u></u><h1><h1></h1></h", "1></h3><ul><h3><html><u><ul></ul></u><ol><i><h3><h", "1></h1><h3></h3></h3></i><h2></h2><li></li></ol><o", "l><b><li><p></p></li><h2><h2></h2></h2></b><html><", "/html></ol></html><h3><p><p><h3></h3></p></p></h3>", "<p><h1><li></li></h1><u></u><u></u></p></h3><i><h1", "></h1></i></ul><h1><li></li></h1><html></html><ol>", "</ol><ul></ul></h1><h3><ul><ul><h2><h3><b><u><b></", "b><li></li><i></i></u></b><b></b><i></i><h2></h2><", "p><i><li></li></i></p></h3><html><h3><b><p></p></b", "><u></u></h3></html><b></b><li><i></i><h3></h3></l", "i></h2><h1><ol></ol></h1><ul><h3><ul></ul><html></", "html><i></i></h3><p></p></ul><ul><p></p></ul><ol><", "h2><ul><p></p><ol><b></b></ol><h3></h3><i></i></ul", "><b></b><h3><h1></h1></h3></h2></ol><li></li><i></", "i></ul><ol><h1><h3><u><b></b><p></p></u><u></u></h", "3><b><i><h2><h1></h1></h2><ul></ul></i></b><u></u>", "</h1><b><p><h3><u></u></h3></p><i><li></li></i><ul", "></ul></b><h2></h2></ol><b></b><ol></ol><ul><p></p", "><h1></h1></ul></ul></h3></h1><ul><h2><h2><b></b><", "ol></ol><h1></h1></h2><h3><li></li></h3><h3></h3><", "html></html><b></b><ul></ul></h2><html><p><h2></h2", "></p><li><li></li></li></html><i></i></ul><h1><h2>", "</h2></h1></ol><i></i></html><p><u></u></p><ul><i>", "<i><p><li><b></b><ul></ul></li><h1></h1><html><ol>", "</ol></html><html><ul></ul></html></p><h2></h2><h3", "></h3></i></i><ul></ul><li></li></ul><b><h3></h3><", "/b></html>" };
    assertEquals("intree 183", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case42() {
    String[] docA = { "<html><b><i><h2><h3><u><b></b><i><h1><h3></h3><h2>", "</h2></h1><u></u></i></u><b><h2></h2><p><p></p><ht", "ml></html></p></b><li><li><h2><h1></h1></h2><b></b", "></li></li><h1></h1></h3><li><h2><h3><i><b><html><", "b><i></i></b><h2></h2><i></i></html></b></i></h3><", "u><u><h3><li><ol><p></p></ol></li><li><ul></ul><ol", "></ol></li></h3></u><u><ol></ol></u><p><h2><b><b><", "h2><u></u></h2></b></b><u><html></html></u><html><", "/html></h2><li><u></u></li></p><h3></h3><u></u></u", "><ol><li><html><li><h2></h2></li></html></li><h3><", "/h3><u><i></i></u><h3><p></p></h3></ol></h2><li><u", "></u><h2></h2></li><html></html></li><p><li><i></i", "></li><u></u><ul><ol><h3></h3></ol><ul><p></p></ul", "></ul><b></b><ul></ul></p><p></p><li></li></h2><i>", "<html><html><u><b></b><ul></ul><html></html></u><i", "></i></html></html><li><html></html></li><h2><b><u", "></u><li></li></b><p></p></h2></i><li></li><h1></h", "1><h1></h1></i><b><p><h3><p><i></i><u><ol><h1></h1", "><p><u></u></p></ol></u><h2></h2></p><ol><p><b><h1", "></h1></b></p><h1><ul></ul></h1></ol><li></li><ol>", "</ol></h3><h1><u><p></p></u><html></html></h1></p>", "<ul><i><li><h2></h2></li><i></i><ul></ul><ol><html", "><i></i></html><html></html></ol></i><h3></h3></ul", "></b></b><html><h2><h2><li></li></h2><li></li></h2", "></html><html><html></html></html></html>" };
    String[] docB = { "<html><b><b><p><h3><p><i></i><h2></h2></p><ol><p><", "b><h1></h1></b></p><h1><ul></ul></h1></ol><li></li", "><ol></ol></h3></p><ul><i><ul></ul><ol><html><i></", "i></html><html></html></ol></i><h3></h3></ul></b><", "/b><html></html></html>" };
    assertEquals("outtree 118", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case43() {
    String[] docA = { "<html><b><ol><i></i><b></b><b><i></i></b><ol></ol>", "</ol><ol></ol></b><li></li><li><h3></h3><i></i></l", "i></html>" };
    String[] docB = { "<html><h2></h2><i><h3><h1></h1></h3></i><p></p><ol", "></ol></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case44() {
    String[] docA = { "<html><h3><ol><i><i></i><h2></h2><li><p></p></li><", "h1></h1></i></ol><html><p><h3><p><i></i><h1></h1><", "h2><h1><h2></h2></h1></h2></p><p><h3><h3><h1></h1>", "</h3></h3><u></u></p><u></u><h1></h1></h3><h2><u><", "h2><i></i><h2><u></u></h2></h2></u></h2><b><p><ul>", "</ul><i></i><html></html></p><i></i></b><ol></ol><", "/p><i><u></u></i><ol></ol><li><p><li></li></p></li", "><h3><b></b><h1></h1></h3></html><h2><i><h3><h1><h", "2><b><p></p></b><ul><p></p></ul><h3></h3></h2><u><", "i><li><ul><h1></h1></ul></li></i><h1><html><p></p>", "</html><p></p></h1><ol></ol><p></p></u><ul><h1></h", "1></ul></h1><h3></h3><i><ol><i><h2><b></b></h2></i", "></ol><p><ol><h2></h2><i></i><li></li></ol></p></i", "></h3><h3></h3><u><h3></h3></u><li><h2><h1></h1></", "h2><li></li></li><h3></h3><h2></h2></i><i><b></b><", "/i><h3></h3></h2><b><i><h3><ol><html><b></b></html", "><p></p></ol></h3><ol><p></p><p></p></ol></i><ol><", "/ol><ol></ol></b><html></html></h3><h3><ul><html><", "html><h3><b><b><h2><b></b></h2></b><li><i><h1></h1", "></i></li><li><h1></h1><ul></ul></li><h1><b></b></", "h1><html></html></b></h3></html></html><p><ul><p><", "i></i><h3><html></html></h3><p></p></p><p></p><p><", "p><li></li></p><html><ol><p></p></ol></html><li></", "li></p><html></html></ul><h1><ul><html></html><li>", "<ol><html></html></ol><p></p></li></ul><li><h3></h", "3></li></h1></p><i><li></li></i><h2></h2></ul><ul>", "<h3><html></html></h3><p></p></ul><b><u></u></b></", "h3><ul><html></html><b></b></ul><b><li></li><ol><h", "2></h2></ol><h1><html></html></h1><h2></h2></b><ul", "><b><p><html><html></html><b></b></html><h1></h1><", "/p><h1><p><ol><html></html></ol><li></li></p><p><i", "></i><html><i></i></html></p></h1><ul></ul></b><b>", "<li><h3></h3><b><h2></h2><li></li></b></li></b><b>", "</b></ul><h2></h2></html>" };
    String[] docB = { "<html><h3><ol><i><i></i><h2></h2><li><p></p></li><", "h1></h1></i></ol><html><p><h3><p><i></i><h1></h1><", "h2><h1><h2></h2></h1></h2></p><p><h3><h3><h1></h1>", "</h3></h3><u></u></p><u></u><h1></h1></h3><h2><u><", "h2><i></i><h2><u></u></h2></h2></u></h2><b><p><ul>", "</ul><i></i><html></html></p><i></i></b><ol></ol><", "/p><i><u></u></i><ol></ol><li><p><li></li></p></li", "><h3><b></b><h1></h1></h3></html><h2><i><h3></h3><", "u><h3></h3></u><li><h2><h1></h1></h2><li></li></li", "><h3></h3><h2></h2></i><i><b></b></i><h3></h3></h2", "><b><i><h3><ol><html><b></b></html><p></p></ol></h", "3><ol><p></p><p></p></ol></i><ol></ol><ol></ol></b", "><html></html></h3><h3><ul><html><html><h3><b><b><", "h2><b></b></h2></b><li><i><h1></h1></i></li><li><h", "1></h1><ul></ul></li><h1><b></b></h1><html></html>", "</b></h3></html></html><p><ul><p><i></i><h3><html>", "</html></h3><p></p></p><p></p><p><p><li></li></p><", "html><ol><p></p></ol></html><li></li></p><html></h", "tml></ul><h1><ul><html></html><li><ol><html></html", "></ol><p></p></li></ul><li><h3></h3></li></h1></p>", "<i><li></li></i><h2></h2></ul><ul><h3><html></html", "></h3><p></p></ul><b><u></u></b></h3><ul><html></h", "tml><b></b></ul><b><li></li><ol><h2></h2></ol><h1>", "<html></html></h1><h2></h2></b><ul><b><p><html><ht", "ml></html><b></b></html><h1></h1></p><h1><p><ol><h", "tml></html></ol><li></li></p><p><i></i><html><i></", "i></html></p></h1><ul></ul></b><b><li><h3></h3><b>", "<h2></h2><li></li></b></li></b><b></b></ul><h2></h", "2></html>" };
    assertEquals("outtree 32", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case45() {
    String[] docA = { "<html><li><ol></ol></li></html>" };
    String[] docB = { "<html><li><ol><ol><h1><ul><b><html></html><ol></ol", "></b><li><p></p></li></ul></h1><h1><h1><u></u></h1", "><i><h2></h2></i></h1><h3><p></p></h3><h1><h3><ol>", "</ol></h3><html></html></h1></ol><h2><ul><ul><b><h", "1><p></p></h1><html></html><li></li></b></ul><ul><", "h1><p></p></h1><html></html><u></u></ul><u></u><b>", "<h2></h2></b><p></p></ul><html><p><h2><b><li></li>", "</b><ul></ul><ul></ul></h2><h1></h1><i><h3><i></i>", "<ol></ol></h3><ol></ol></i><i></i></p><p><ul><h1><", "/h1></ul><p><h2><i><b></b><h1></h1><li></li></i><h", "tml></html></h2><h2><i></i></h2></p><u><p><h2></h2", "></p><h1></h1></u></p><ol><h3><i></i></h3><html><h", "2></h2><p></p></html><html><li><u></u></li></html>", "<ol><u><b></b></u><p></p></ol><b></b><li></li></ol", "></html><html><ol><u><h3><b></b></h3></u></ol><ul>", "<ul><h2></h2></ul><ol><li><html><p></p><ul><u></u>", "</ul></html><h1><h1><u></u></h1></h1></li></ol></u", "l></html><b></b><ul></ul></h2></ol><html><b></b><u", "l></ul><ul><ol></ol></ul></html><h1><b><ul><ol></o", "l></ul><ol><h1><html><html><h1></h1></html></html>", "<b></b><i></i></h1><h3></h3><b></b><b></b></ol></b", "><u></u></h1></li><li><i><u></u><i></i><ul></ul></", "i><b><u></u><ul></ul></b><p></p><i></i></li></html", ">" };
    assertEquals("intree 130", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case46() {
    String[] docA = { "<html><p><h2></h2></p><b><h3><h3><ul></ul><ol></ol", "></h3><b><li><h3><p></p><h2></h2></h3></li></b></h", "3><h3></h3></b><b><b><li></li></b><h3><p></p></h3>", "<p><b><ol><html></html></ol></b><ul></ul></p></b><", "u><li><b></b></li></u></html>" };
    String[] docB = { "<html><b><u><h3></h3></u><b></b></b><h2><h3><h1></", "h1></h3><i></i><html></html></h2><h3><li></li></h3", "><h2><h2></h2></h2></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case47() {
    String[] docA = { "<html><h1><p><u><ol><b></b></ol><html></html><h2><", "/h2></u><li><html></html></li></p><p><ol></ol><h3>", "<b></b></h3><i></i></p><h2><b></b><html></html><ul", "></ul></h2><h2></h2><h1><u></u><h2></h2></h1><p></", "p><h1></h1></h1><h1><h3><ul><u></u><i><b></b></i><", "/ul></h3><li><b><i></i></b><i></i></li><ol><p></p>", "</ol><h2><ol></ol><p><li><u></u></li></p><html><li", "></li></html></h2><h2></h2></h1><u><ol><h1></h1></", "ol></u><i><ol><p></p></ol></i><b></b></html>" };
    String[] docB = { "<html><h1><p><p><h1><h1><html></html></h1><h2></h2", "></h1><h1><h1><h1><ul></ul></h1><ol></ol><h1></h1>", "<ul></ul></h1><ul></ul><html></html><li></li></h1>", "<h1><html></html><h2></h2></h1></p><u><u><h2><ol><", "html></html></ol></h2><html></html></u><ol><b></b>", "</ol><html></html><h2></h2></u><li><html></html></", "li><ol></ol></p><p><ol><p><ol><h1></h1><b><i></i><", "/b></ol><u><li><li><ul><ol></ol></ul><h2></h2></li", "></li></u><i><ul><u></u></ul><u></u></i></p><u><h2", "><h3></h3><li><li><b><ol></ol></b><h1></h1><u></u>", "</li></li><li></li><p><h3></h3></p></h2><li><i><h1", "></h1></i><li></li></li><h2></h2></u><ol><h2></h2>", "</ol></ol><h3><b></b><h2></h2></h3><i><ul></ul></i", "></p><h2><b></b><html></html><ul></ul></h2><h2></h", "2><h1><b><html></html></b><html><ul></ul></html><u", "></u><b></b><h2></h2></h1><b><html></html><p><html", "></html><ol><ul></ul></ol><li><ul><b></b></ul></li", "></p><li><b></b></li></b><p></p><b></b><h1></h1></", "h1><h1><h3><ul><i><u></u></i><u></u><i><b></b></i>", "<ol></ol></ul></h3><li><h2><i><p><ul></ul><u></u><", "ol></ol></p><u><i></i></u><h3></h3></i></h2><h3><h", "3><ol><ul><u></u></ul><html></html></ol><i></i></h", "3><ul></ul></h3><ul><html><h1></h1></html></ul><b>", "<i></i></b><i></i></li><ol><p></p></ol><h2><ol></o", "l><p><ul></ul><li><u></u></li><h1></h1></p><html><", "li></li></html></h2><h2></h2></h1><b><h3></h3><ul>", "</ul></b><u><ol><h1></h1></ol></u><i><ol><p></p></", "ol></i><b><p></p></b><ol></ol></html>" };
    assertEquals("intree 107", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case48() {
    String[] docA = { "<html><i><li><ol><p></p><b></b></ol><ul></ul><b></", "b></li><b></b><p></p></i><html><u><ol></ol><ul></u", "l><p></p></u><i><b></b><ul></ul></i><h2><p></p><h1", "></h1><p><html></html></p></h2><html><u></u></html", "><h2></h2></html><li><html><ul></ul><ol></ol><html", "></html></html><i></i><li></li></li><li></li></htm", "l>" };
    String[] docB = { "<html><i><li><ol><b></b></ol><ul></ul><b></b></li>", "<b></b><p></p></i><html><u><ol></ol><ul></ul><p></", "p></u><i><b></b><ul></ul></i><h2><p></p><h1></h1><", "p><html></html></p></h2><html><u></u></html><h2></", "h2></html><li><html><ul></ul><ol></ol><html></html", "></html><i></i></li><li></li></html>" };
    assertEquals("outtree 2", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case49() {
    String[] docA = { "<html><h2><u><h2></h2></u><u><p></p></u></h2><h3><", "html></html></h3><li><b></b></li><h1><h1><ol><i><u", "l></ul></i></ol><b></b></h1><h1></h1><i><i><ul><h3", "></h3><b></b></ul></i></i></h1><h2><h2><html></htm", "l></h2></h2><b></b></html>" };
    String[] docB = { "<html><h3><h3><p></p></h3><i><html></html></i></h3", "><h3><li><p><li></li></p><ul></ul><ul><h2><p></p><", "/h2></ul><li><html></html></li></li><h1></h1><li><", "/li></h3></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case50() {
    String[] docA = { "<html><u><u><h2><html><u></u><h3></h3></html><b><h", "3></h3></b><html></html><html><ul><h2></h2></ul></", "html><p><h2></h2><h1></h1></p><h3></h3></h2><ol><h", "2><h3></h3></h2><li><html><ol><h3><h3><ul></ul></h", "3><h1><p><u><h3></h3></u><h2></h2><ul></ul></p><b>", "</b></h1><li></li></h3></ol></html><h1><li></li></", "h1><p></p><b><html><html></html></html><ul></ul></", "b></li><p><b><h1></h1></b><b><li></li></b></p><li>", "</li><ol></ol><b></b></ol><h2><i><h1><b><b></b></b", "></h1></i><b><u></u></b><p><html><html><h3></h3></", "html></html><u></u><h2></h2></p></h2><h3><li><u></", "u><html></html><ol></ol><b></b></li></h3></u><p><h", "1><i></i><i></i></h1><ul><ul></ul><ol><html></html", "></ol><h2></h2></ul><i></i><u></u><h3></h3></p><h2", "><b><ul><ul><html></html></ul><html></html></ul></", "b><li></li><h2></h2></h2><i><u><ul><h1></h1></ul><", "b><u></u></b><html><ul><h3></h3></ul></html></u></", "i><b><u></u></b></u><i><h2><ul><h2></h2><b><li></l", "i></b><h1></h1><b><html></html></b></ul><h3><p><h1", "></h1></p><h1><h1></h1><ul></ul></h1><b><html><h3>", "</h3><html></html></html><h2></h2></b><b></b><u></", "u><u></u></h3><i><u></u></i><h2><html></html></h2>", "<h1></h1></h2><h3></h3></i><html><li><u><b></b></u", "><b></b><i></i></li></html><ol></ol><h3></h3></htm", "l>" };
    String[] docB = { "<html><u><u><h2><html></html><b><h3></h3></b><html", "></html><html><ul><h2></h2></ul></html><h3></h3></", "h2><ol><h2><h3></h3></h2><li><h1><li></li></h1><p>", "</p><b><html><html></html></html></b></li><ol></ol", "><b></b></ol><h3><li><u></u></li></h3></u><p><i></", "i><u></u><h3></h3></p><i><u><ul></ul><b><u></u></b", "></u></i><b></b></u><i><h2><ul><b><li></li></b><h1", "></h1><b><html></html></b></ul><h3><p></p><h1><h1>", "</h1></h1><u></u><u></u></h3><i><u></u></i><h2></h", "2></h2></i><html><li><u></u><i></i></li></html><h3", "></h3></html>" };
    assertEquals("outtree 77", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case51() {
    String[] docA = { "<html><h1></h1><ul><li><h2><i></i></h2><p></p><p>", "</p><p></p></li><li><h2><i></i></h2><p></p><p></p", "></li></ul></html>" };
    String[] docB = { " <html> turtles <h1> snapping </h1> <ul> <li> <h2", "> common <i> chelydra serpentina </i> </h2> <p>", "hunter </p> <p> rarely basks <h3>", "<i>almost</i> <b>never</b> </h3> </p>", "<p> jeopardized by traffic </p></li>", "<li> often confused with... <h2> alligator snapp", "ing turtle <i>macroclemys temminckii</i> </h2>", "<p> massive head </p> big! <p>", "largest freshwater turtle. </p> <p> <b>pink</b>", " <b>wormlike</b> lure in mouth </p> <p> imposing", "sight on land or water </p> </li></ul></html>  " };
    assertEquals("intree 7", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case52() {
    String[] docA = { "<html><h1></h1><ul><li><h2><i></i></h2><p></p><p>", "</p><p></p></li><li><h2><i></i></h2><p></p><p></p", "></li></ul></html>" };
    String[] docB = { " <html> snapping turtles <ul> <li> common ", "snapping turtle, chelydra serpentina <p>", "hunter </p> <p> rarely basks </p> ", "<p> jeopardized by traffic </p></li>", "<li> often confused with... <h2> alligator snapp", "ing turtle <i>macroclemys temminckii</i> </h2>", "<p> massive head; largest freshwater turtle;", "pink wormlike appendage lures fish </p>", "</li></ul></html>  " };
    assertEquals("outtree 4", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case53() {
    String[] docA = { "<html><p></p></html>" };
    String[] docB = { "<html><li><p></p></li></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case54() {
    String[] docA = { "<html><h3></h3><h2></h2><h1></h1></html>" };
    String[] docB = { "<html><h1></h1><h2></h2></html>" };
    assertEquals("incompatible", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case55() {
    String[] docA = { "<html><p></p><i></i><p></p></html>" };
    String[] docB = { "<html><i></i><p></p></html>" };
    assertEquals("outtree 1", bloggodocstructure.compare(docA, docB));
  }

  @Test
  public void case56() {
    String[] docA = { "<html><p><i></i></p><p><h1></h1></p></html>" };
    String[] docB = { "<html><p><h1></h1></p></html>" };
    assertEquals("outtree 2", bloggodocstructure.compare(docA, docB));
  }

}
