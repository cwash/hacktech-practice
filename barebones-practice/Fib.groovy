// use Groovy CLI - see http://groovy.codehaus.org/Groovy+CLI

def file = new File('fib.txt')
def input = Integer.parseInt(file.text)

println computeFib(input);



static def computeFib(int index) {

    if (index < 0)
        throw IllegalArgumentException("negatives not supported");

    if (index == 0)
        return 0

    if (index == 1)
        return 1

    return computeFib(index - 2) + computeFib(index - 1);

}