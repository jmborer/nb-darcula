/*
 * Copyright 2016 markiewb.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.revivius.nb.darcula.options;

import com.revivius.nb.darcula.DarculaLFCustoms;
import java.awt.Font;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.util.prefs.Preferences;
import javax.swing.UIManager;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.NbPreferences;

@OptionsPanelController.Keywords(
        location = "Appearance",
        tabTitle = "Darcula Look and Feel",
        keywords = {
            "dark theme",
            "dark",
            "theme",
            "laf",
            "font",
            "look and feel",
            "darcula",
            "invert",
            "invert colors",
            "stretched",
            "stretched tabs",
            "tree indent",
            "indent"
        }
)
public class DarculaLAFPanel extends javax.swing.JPanel {

    private final DarculaLAFOptionsPanelController controller;

    DarculaLAFPanel(DarculaLAFOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    public void reinitUI() {
        if (!cbFontSizeOverride.isSelected()) {
            lblFontName.setText(DarculaLFCustoms.DEFAULT_FONT);
        }

        lblFontName.setEnabled(cbFontSizeOverride.isSelected());
        btnChooseFont.setEnabled(cbFontSizeOverride.isSelected());

        spTreeIndent.setEnabled(cbTreeIndentOverride.isSelected());
        lblTreeIndentPx.setEnabled(cbTreeIndentOverride.isSelected());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbFontSizeOverride = new javax.swing.JCheckBox();
        lblFontName = new javax.swing.JTextField();
        btnChooseFont = new javax.swing.JButton();
        cbInvertIcons = new javax.swing.JCheckBox();
        cbStretchedTabs = new javax.swing.JCheckBox();
        cbTreeIndentOverride = new javax.swing.JCheckBox();
        spTreeIndent = new javax.swing.JSpinner();
        lblTreeIndentPx = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(cbFontSizeOverride, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.cbFontSizeOverride.text")); // NOI18N
        cbFontSizeOverride.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbFontSizeOverrideStateChanged(evt);
            }
        });

        lblFontName.setEditable(false);
        lblFontName.setText(org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.lblFontName.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnChooseFont, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.btnChooseFont.text")); // NOI18N
        btnChooseFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFontActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cbInvertIcons, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.cbInvertIcons.text")); // NOI18N
        cbInvertIcons.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInvertIconsItemStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cbStretchedTabs, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.cbStretchedTabs.text")); // NOI18N
        cbStretchedTabs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbStretchedTabsItemStateChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cbTreeIndentOverride, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.cbTreeIndentOverride.text")); // NOI18N
        cbTreeIndentOverride.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbTreeIndentOverrideStateChanged(evt);
            }
        });

        spTreeIndent.setModel(new javax.swing.SpinnerNumberModel(8, 4, 60, 1));

        org.openide.awt.Mnemonics.setLocalizedText(lblTreeIndentPx, org.openide.util.NbBundle.getMessage(DarculaLAFPanel.class, "DarculaLAFPanel.lblTreeIndentPx.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbStretchedTabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbInvertIcons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbFontSizeOverride)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFontName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChooseFont))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbTreeIndentOverride)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spTreeIndent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTreeIndentPx)))
                        .addGap(0, 222, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFontSizeOverride)
                    .addComponent(lblFontName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseFont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTreeIndentOverride)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spTreeIndent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTreeIndentPx)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbInvertIcons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbStretchedTabs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbFontSizeOverrideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbFontSizeOverrideStateChanged
        controller.changed();
        reinitUI();
    }//GEN-LAST:event_cbFontSizeOverrideStateChanged

    private void btnChooseFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFontActionPerformed
        PropertyEditor pe = PropertyEditorManager.findEditor(Font.class);
        Font f = Font.decode(lblFontName.getText());
        pe.setValue(f);
        DialogDescriptor dd = new DialogDescriptor(
                pe.getCustomEditor(),
                "Font Chooser"
        );
        dd.setOptions(new Object[]{
            DialogDescriptor.OK_OPTION,
            DialogDescriptor.CANCEL_OPTION
        });
        DialogDisplayer.getDefault().createDialog(dd).setVisible(true);
        if (dd.getValue() == DialogDescriptor.OK_OPTION) {
            f = (Font) pe.getValue();
            lblFontName.setText(f.getName() + " " + f.getSize());
            controller.changed();
        }
    }//GEN-LAST:event_btnChooseFontActionPerformed

    private void cbInvertIconsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInvertIconsItemStateChanged
        controller.changed();
    }//GEN-LAST:event_cbInvertIconsItemStateChanged

    private void cbStretchedTabsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStretchedTabsItemStateChanged
        controller.changed();
    }//GEN-LAST:event_cbStretchedTabsItemStateChanged

    private void cbTreeIndentOverrideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbTreeIndentOverrideStateChanged
        controller.changed();
        reinitUI();
    }//GEN-LAST:event_cbTreeIndentOverrideStateChanged

    void load() {
        Preferences prefs = NbPreferences.forModule(DarculaLAFPanel.class);

        cbFontSizeOverride.setSelected(prefs.getBoolean(DarculaLAFOptionsPanelController.OVERRIDE_FONT_BOOLEAN, false));
        lblFontName.setText(prefs.get(DarculaLAFOptionsPanelController.FONT_STRING, DarculaLFCustoms.DEFAULT_FONT));

        cbTreeIndentOverride.setSelected(prefs.getBoolean(DarculaLAFOptionsPanelController.OVERRIDE_TREE_INDENT_BOOLEAN, false));
        spTreeIndent.setValue(prefs.getInt(DarculaLAFOptionsPanelController.TREE_INDENT_INT, UIManager.getInt("Tree.leftChildIndent")));

        cbInvertIcons.setSelected(prefs.getBoolean(DarculaLAFOptionsPanelController.INVERT_ICONS_BOOLEAN, false));
        cbStretchedTabs.setSelected(prefs.getBoolean(DarculaLAFOptionsPanelController.STRETCHED_TABS_BOOLEAN, false));

        reinitUI();
    }

    void store() {
        Preferences prefs = NbPreferences.forModule(DarculaLAFPanel.class);

        prefs.putBoolean(DarculaLAFOptionsPanelController.OVERRIDE_FONT_BOOLEAN, cbFontSizeOverride.isSelected());
        prefs.put(DarculaLAFOptionsPanelController.FONT_STRING, lblFontName.getText());

        prefs.putBoolean(DarculaLAFOptionsPanelController.OVERRIDE_TREE_INDENT_BOOLEAN, cbTreeIndentOverride.isSelected());
        prefs.putInt(DarculaLAFOptionsPanelController.TREE_INDENT_INT, (Integer) spTreeIndent.getValue());

        prefs.putBoolean(DarculaLAFOptionsPanelController.INVERT_ICONS_BOOLEAN, cbInvertIcons.isSelected());
        prefs.putBoolean(DarculaLAFOptionsPanelController.STRETCHED_TABS_BOOLEAN, cbStretchedTabs.isSelected());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFont;
    private javax.swing.JCheckBox cbFontSizeOverride;
    private javax.swing.JCheckBox cbInvertIcons;
    private javax.swing.JCheckBox cbStretchedTabs;
    private javax.swing.JCheckBox cbTreeIndentOverride;
    private javax.swing.JTextField lblFontName;
    private javax.swing.JLabel lblTreeIndentPx;
    private javax.swing.JSpinner spTreeIndent;
    // End of variables declaration//GEN-END:variables
}
