void CPractice4aDlg::UpdateComboBox()
{
	int nCnt = m_listBox.GetCount();
	m_cbListItem.ResetContent();

	for (int i = 0; i < nCnt; i++){
		CString strItem;
		strItem.Format(_T("리스트 항목 : %d"), i + 1);
		m_cbListItem.AddString(strItem);
	}
}


void CPractice4aDlg::OnClickedCheck2()
{
	if (m_bChecked[1] == FALSE) {
		m_bChecked[1] = TRUE;
		m_listBox.AddString(_T("2번 체크 박스 상태 TRUE"));
	}
	else {
		m_bChecked[1] = FALSE;
		m_listBox.AddString(_T("2번 체크 박스 상태 FALSE"));
	}
	UpdateComboBox();
}


void CPractice4aDlg::OnRadio1()
{
	m_listBox.AddString(_T("1번 라디오 버튼 선택"));
	UpdateComboBox();
}


void CPractice4aDlg::OnRadio2()
{
	m_listBox.AddString(_T("2번 라디오 버튼 선택"));
	UpdateComboBox();
}


void CPractice4aDlg::OnClickedButtonAdd()
{
	UpdateData(TRUE);
	if (m_strEdit.IsEmpty() == FALSE) {
		m_listBox.AddString(m_strEdit);
		m_strEdit.Empty();
	}
	else {
		AfxMessageBox(_T("에디트 상자에 문자열이 없습니다."));
	}
	UpdateData(FALSE);
	UpdateComboBox();
}


void CPractice4aDlg::OnClickedButtonDelete()
{
	int index = m_cbListItem.GetCurSel();
	if (index != CB_ERR) {
		m_listBox.DeleteString(index);
		UpdateComboBox();
	}
	else {
		AfxMessageBox(_T("콤보박스에서 삭제할 아이템을 선택하세요"));
	}
}
