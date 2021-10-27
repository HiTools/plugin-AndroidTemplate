import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider

class AndroidTemplateProvider : DefaultLiveTemplatesProvider {
    override fun getDefaultLiveTemplateFiles(): Array<String> {
        return arrayOf("liveTemplates/java", "liveTemplates/xml")
    }

    override fun getHiddenLiveTemplateFiles(): Array<String?> {
        return arrayOfNulls(0)
    }
}