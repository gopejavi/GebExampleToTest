import geb.Module

class LocalPageSearchboxModule extends Module
{
    static content =
    {
        searchbox { $("#simpleSearch") }
        searchInput { searchbox.$("#searchInput") }
        searchButton { searchbox.$("#searchButton") }       
    }

    void searchFor(term)
    {
        searchInput = term
        searchButton.click()
        waitFor {js.('document.readyState') == 'complete'}
    }
}
