package model;

import model.AllRoutes;

/**
 * Created by ����� on 28.04.2017.
 */
public class OurRoutes {

    public static AllRoutes createListRoutes()
    {
        AllRoutes list_routes = new AllRoutes();
        Route tmpRoute;

        String a_d = "���������� ������ - �������� ������� ������ ��������� ����. ������ ����� 3266 � � ��������� ������ �����-������. ������ ����� ���������� ����� �������. ������� ����� ������ ��������-������ ������� ��� �����������.\n" +
                "������ ��������, �������� ���������������� ������. ������� ���� ����� �� ������ 1700 �. ������� ������ � ����� ���� ����� ��������� ������. ���������� �����������.\n" +
                "������� ������ ��������� � ��������� ������ �.��������. ��� ������ ����� ������� �� �����, ������� �������� ���������, ���������� � ���������. �� ������� ����� ������ ��������� ��������� ���������. �������� ����� ���������� ��������� ����������.";

        tmpRoute = new Route("6. �����", "6.1.2. ���������� ������",false, "1�", "��������",
                "� ������", "�.���������", "1971�", a_d, "11-12 �.", "������������� 3850�",
                "������� (1 �� 3 �������)", "/images/pic2.jpg", "/images/pic4.jpg");

        tmpRoute.addPeaks(new Peaks("�����", "2546�", "51.951866", "102.461475"));
        tmpRoute.addSections(new Sections("������� �������, �������� �������������. 2250�, 25?, I"));
        tmpRoute.addSections(new Sections("�����. ������ �� ������ �������, �� ������, ������ ����� �����. ����� �� ������������ ������, �� ������ ������� ���-�����, �������� � ���� ����� ������. ����� �� ���������. 180�, 30?, II"));
        tmpRoute.addSections(new Sections("�����. ������ �� 2-� �������, � ������ ����� ����� ���� ������, ����� �����, ������� ������� �������, ������. ������-������ ��������. 300�, 25?, II"));
        tmpRoute.addSections(new Sections("�����, �����, ������. ����� � ��������� � ������������ ����������. ��������� �������� ����� �� ��������� �������-�� ��������� ������. ������ �� �������� ������, ��������� ������������� � ������������. ��������� �������� ����� 4 ��������, ������� �� �������� ������ ���������� ����. �� ��-����� ����� ������ ������� � ��������� �� �������. 200�, 35?, II-III"));
        tmpRoute.addSections(new Sections("�����. �������� �� ������ � ������������ ����������, ��-������� ��������� �������� ������� ���� ��� ���������. 350�, 25?, II"));
        tmpRoute.addSections(new Sections("�����, ������������ ��������. 200�, 20?, II"));
        tmpRoute.addSections(new Sections("�������, ����������� �����, ������������ ��������. � ������� ����� ������� ������������ ������ � ������� � �����-��. 250�, 30?, II"));

        list_routes.addRoute(tmpRoute);
        return list_routes;
    }
}