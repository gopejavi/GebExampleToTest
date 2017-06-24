import geb.Page

class WikipediaHomePage extends Page
{
    static at = { title == "Wikipedia" }

    static content =
    {
        languagesWikis { module(MainPageLanguagesModule) }
    }
}
