import geb.Module

class ReferencesSectionModule extends Module
{
    static content =
    {
        refsList { $(".reflist .references") }
        refWithText { text -> refsList.$("li .reference-text cite", text: contains(text)) }
    }
}
