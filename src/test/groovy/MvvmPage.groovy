import geb.Page

class MvvmPage extends Page
{
    static at = { title == "Model–view–viewmodel - Wikipedia" }

    static content =
    {
        referencesLinkedFromText { module(ReferencesLinkedFromTextModule) }
        referencesSection { module(ReferencesSectionModule) }
	header { module(HeaderModule) }
        footer { module(FooterModule) }
    }
}
