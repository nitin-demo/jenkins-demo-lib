import com.kss.builder.Utils
def Utils = new Utils()
def call() {
    return Math.abs(new Random().nextInt() % 8000) + 1000
}


def getcommit(){
    def value = Utils.lastCommit()
    return value
}