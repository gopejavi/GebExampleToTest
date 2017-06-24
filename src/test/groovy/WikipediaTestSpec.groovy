import geb.spock.GebSpec

class GebishOrgSpec extends GebSpec {

/*    def "can get to the current Book of Geb"() {
        when:
        to GebishOrgHomePage

        and:
        manualsMenu.open()

        then:
        manualsMenu.links[0].text().startsWith("current")

        when:
        manualsMenu.links[0].click()

        then:
        at TheBookOfGebPage
    }*/
def "Simple test to navigate throught Wikipedia"()
{
        given: "Access to Main Wikipedia Page"
        to WikipediaHomePage

        when: "Click on the link that reads English"
        languagesWikis.openLanguage("English")

        then: "We accessed to the English version of the Wikipedia"
        at EnglishWikipediaPage

        when: "Search the term MVVM"
        localSearchbox.searchFor("MVVM")

        then: "We accessed to the page that talks about MVVM"
        at MvvmPage
    }
}
