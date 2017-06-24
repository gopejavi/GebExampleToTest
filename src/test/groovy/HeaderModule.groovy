import geb.Module

class HeaderModule extends Module
{
    static content =
    {
        header { $("#mw-head") }
        personalArea { header.$("#p-personal") }
    }
}
