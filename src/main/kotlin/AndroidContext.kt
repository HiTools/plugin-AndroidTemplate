import com.intellij.codeInsight.template.TemplateContextType
import com.intellij.psi.PsiFile

open class AndroidContext protected constructor() : TemplateContextType("Android", "Android") {
    override fun isInContext(file: PsiFile, offset: Int): Boolean {
        val fileName = file.name
        return fileName.endsWith(".java") || fileName.endsWith(".xml") || fileName.endsWith(".ks")
    }
}