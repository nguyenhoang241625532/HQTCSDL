/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyquancafe;

import DataProvider.ConstantClass;
import DataTransfer.NhanVien;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author HT
 */
public class pnlQLNV extends javax.swing.JPanel {

    private CardLayout cl = new CardLayout();
    private JPanel pnlTTCaNhan;
    private JPanel pnlDoiMK;
    private JPanel pnlDSNV;
    private NhanVien nhanvien;
    
    /**
     * Creates new form pnlQLNV
     */
    public pnlQLNV(NhanVien nv) {
        initComponents();
        
        this.setSize(ConstantClass.WIDTH_OF_CONTENT_PANEL, ConstantClass.HEIGHT_OF_CONTENT_PANEL);
        
        nhanvien = nv;
        
        LoadPanelContent();
        
        Configuration(nv.getLoaiNV());
    }

    void Configuration(String LoaiNV)
    {
        if (LoaiNV.equals("NV"))
        {
            btnDSNhanVien.setEnabled(false);
        }
    }
    
    void LoadPanelContent()
    {
        pnlTTCaNhan = new pnlThongTinCaNhan(nhanvien);
        pnlDoiMK = new pnlDoiMatKhau(nhanvien);
        pnlDSNV = new pnlDSNhanVien();
        
        pnlContent.setLayout(cl);
        
        pnlContent.add(pnlTTCaNhan, "TT Ca nhan");
        pnlContent.add(pnlDoiMK, "Doi MK");
        pnlContent.add(pnlDSNV, "DS nhan vien");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        btnThongTinCaNhan = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnDSNhanVien = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();

        btnThongTinCaNhan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnThongTinCaNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info - small.png"))); // NOI18N
        btnThongTinCaNhan.setText("Thông tin cá nhân");
        btnThongTinCaNhan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongTinCaNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongTinCaNhanMouseClicked(evt);
            }
        });

        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/change password.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMatKhauMouseClicked(evt);
            }
        });

        btnDSNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDSNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/human management.png"))); // NOI18N
        btnDSNhanVien.setText("Danh sách nhân viên");
        btnDSNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDSNhanVienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDSNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongTinCaNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btnThongTinCaNhan)
                .addGap(18, 18, 18)
                .addComponent(btnDoiMatKhau)
                .addGap(18, 18, 18)
                .addComponent(btnDSNhanVien)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1071, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongTinCaNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinCaNhanMouseClicked
        // TODO add your handling code here:
        cl.show(pnlContent, "TT Ca nhan");
    }//GEN-LAST:event_btnThongTinCaNhanMouseClicked

    private void btnDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMatKhauMouseClicked
        // TODO add your handling code here:
        cl.show(pnlContent, "Doi MK");
    }//GEN-LAST:event_btnDoiMatKhauMouseClicked

    private void btnDSNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSNhanVienMouseClicked
        // TODO add your handling code here:
        cl.show(pnlContent, "DS nhan vien");
    }//GEN-LAST:event_btnDSNhanVienMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDSNhanVien;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnThongTinCaNhan;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}