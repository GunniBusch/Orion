package de.tum.www1.orion.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.layout.panel
import javax.swing.JComponent
import javax.swing.JPanel

class ConfirmPasswordSaveDialog(project: Project?) : DialogWrapper(project) {
    private lateinit var confirmationPanel: JPanel

    init {
        title = "Import credentials into IntelliJ"
        init()
        isOKActionEnabled = true
    }

    override fun createCenterPanel(): JComponent? {
        confirmationPanel = panel {
            row {
                label("Do you want to save your ArTEMiS credentials in IntelliJ?\n" +
                        "This makes importing and submitting exercises a lot easier!")
            }
        }

        return confirmationPanel
    }

}
