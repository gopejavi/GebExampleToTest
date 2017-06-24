import geb.Page

class EnglishWikipediaPage extends Page
{
    static at = { title == "Wikipedia, the free encyclopedia" }

    static content =
    {
        localSearchbox { module(LocalPageSearchboxModule) }
	header { module(HeaderModule) }
        footer { module(FooterModule) }
    }
}
