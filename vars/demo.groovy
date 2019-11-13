import com.kss.builder.Utils

def call() {
    return Math.abs(new Random().nextInt() % 8000) + 1000
}


def getcommit(){
    def Utils = new Utils()
    def value = Utils.lastCommit()
    return value
}