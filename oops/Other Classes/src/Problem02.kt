import kotlin.random.Random

/*
A network server responds with this information about blog articles

Title

Content

Number of readers

You receive 2 articles from the server.

Update the title to suit your blog but also keep the originals.

Print out all the article information.
*/
fun main() {
    val articles= arrayListOf<Article>()
    articles.add(getArticle())
    articles.add(getArticle())

    val newArticles= arrayListOf<Article>()

    for(i in articles){
        newArticles.add(i)
        val newArticle=i.copy(title=i.title+ "for my blog")
        newArticles.add(newArticle)
    }

    newArticles.forEach{println(it)}

}

fun getArticle():Article {
    val randomTitle="Title "+ Random.nextInt(100)
    val numberOfReaders=Random.nextInt(100)
    return Article(randomTitle,"Some content",numberOfReaders)
}

data class Article (
    val title:String,
    val content:String,
    val numberOfReaders:Int
)
