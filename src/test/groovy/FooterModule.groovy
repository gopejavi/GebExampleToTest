import geb.Module

class FooterModule extends Module
{
    static content =
    {
        footer { $("#footer") }
	mentionsText { text -> footer.$("ul", text: contains(text)) }
    }
}
