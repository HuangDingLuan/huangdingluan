package org.aeroplane;

/**
 * �ÿͽӿ�
 *
 */

public interface PasssengerInterface {
	/**
	 * ��ȡ�ÿ�����
	 * @return ��������
	 */
	public String getName();
	/**
	 * ��ȡԤ����
	 * @return ����Ԥ����
	 */
	public int getBookingNumber();
	/**
	 * ��ȡ��λ����
	 * @return ��������
	 */
	public int getRow();
	/**
	 * ��ȡ��λ��
	 * @return ������λ��
	 */
	public int getSeatPosition();
}
