
/**
 * Created with IntelliJ IDEA.
 * User: chris
 * Date: 4/30/12
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
class TestPractice extends GroovyTestCase {

    public void testGString() {

        def my = "hello";
        def gstring = "$my, world";

        println(gstring);

        assert gstring == "hello, world";

    }

    public void testCollections() {

        def array = [[3, 1], 8, 15, 20, 22, 22 ];

        def big = array.findAll{ a ->
            a > 20
        }

        assert big == [22, 22]

    }

    public void testSmiley() {
        def smiley = ':-):-):->'
        def pattern = /(:-\))/
        assert smiley.findAll(pattern).size() == 2
    }


}
