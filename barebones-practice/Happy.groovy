
def file = new File(args[0])

def smileBucket = []
def indifferentBucket = []
def sadBucket = []

def lines = file.readLines();
def numLines = lines[0]

/* need to parseInt so groovy doesn't think this is a character (54) */

for (index in 1 .. Integer.parseInt(numLines)) {
/* this is a better way to do it so we don't need to know how many lines are present, but whatever */
//def input = file.eachLine(2, { line ->
    line = lines[index]
    smileBucket += line.findAll(/(:-\))/).size()
    indifferentBucket += line.findAll(/(:-\|)/).size()
    sadBucket += line.findAll(/(:-\()/).size()
//});
}

def total = smileBucket.sum() + indifferentBucket.sum() + sadBucket.sum()


println "There are ${total} people in the crowd"

def formatPercent = { a -> ((double) ((a.sum() / total) * 100)).round(1) }

println "${formatPercent(smileBucket)}% are happy"
println "${formatPercent(sadBucket)}% are sad"
println "${formatPercent(indifferentBucket)}% are indifferent"
