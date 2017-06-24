import geb.spock.GebSpec

class EnglishWikipediaArticleSpec extends GebSpec
{
    def "Simple test to navigate throught Wikipedia"()
    {
        given: "Access to Main Wikipedia Page"
        to WikipediaHomePage

        when: "Click on the link that reads English"
        languagesWikis.openLanguage("English")

        and: "We accessed to the English version of the Wikipedia"
        at EnglishWikipediaPage

        and: "Search the term MVVM"
        localSearchbox.searchFor("MVVM")

        and: "We accessed to the page that talks about MVVM"
        at MvvmPage

	then: "Check there is a reference to Martin Fowler's article below"
        assert referencesSection.refWithText("Martin Fowler")
        assert referencesSection.refWithText("The Presentation Model Design Pattern")
    }
}
