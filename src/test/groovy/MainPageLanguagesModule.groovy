import geb.Module

class MainPageLanguagesModule extends Module
{
    static content =
    {
        languageItems { $(".central-featured-lang") }
        wikiInLanguage { language -> languageItems.$("a strong", text: language) }
    }

    void openLanguage(lang)
    {
        wikiInLanguage(lang).parent().click()
        waitFor {js.('document.readyState') == 'complete'}
    }
}
