package uz.mexboy.matematikadan_masalalar.ui.mundarija;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
;
import uz.mexboy.matematikadan_masalalar.MainActivity;
import uz.mexboy.matematikadan_masalalar.R;
import uz.mexboy.matematikadan_masalalar.adapter.MundarijaAdapter;
import uz.mexboy.matematikadan_masalalar.model.MundarijaModel;
import uz.mexboy.matematikadan_masalalar.ui.home.HomeFragment;

public class MundarijaFragment extends Fragment implements MundarijaAdapter.ItemClickListener {
    private Context mContext;
    private View root;
    private List<MundarijaModel> data;

    private RecyclerView recyclerView;

    private MundarijaAdapter mundarijaAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_mundarija, container, false);

        init();
        return root;
    }

    private void init() {
        data = new ArrayList<>();
        data.add(new MundarijaModel("BOSH SAHIFA", 0));
        data.add(new MundarijaModel("So’z boshi", 2));
        data.add(new MundarijaModel("To’plam tushunchasi. To’plamlar ustida amallar", 4));
        data.add(new MundarijaModel("Sonli to’plamlar. Haqiqiy sonning absolyut qiymati", 7));
        data.add(new MundarijaModel("Kompleks sonlar va ular ustida amallar", 11));
        data.add(new MundarijaModel("Matritsa va ular ustida amallar", 15));
        data.add(new MundarijaModel("Determinantlar", 19));
        data.add(new MundarijaModel("Ikki va uch noma’lumli chiziqli tenglamalar sistemasi. Kramer qoidasi. Gauss usuli", 23));
        data.add(new MundarijaModel("Chiziqli tenglamalar sistemasini yechishning matritsalar usuli", 25));
        data.add(new MundarijaModel("To’g’ri chiziqdagi va tekislikdagi nuqtaning koordinatalari. Ikki nuqta orasidagi masofa va kesmani berilgan nisbatda bo’lish", 27));
        data.add(new MundarijaModel("Chiziq tenglamasi. To’g’ri chiziq va uning turli xil tenglamalari", 31));
        data.add(new MundarijaModel("Ikkinchi tartibli egri chiziqlar. Aylana", 39));
        data.add(new MundarijaModel("Ellips", 41));
        data.add(new MundarijaModel("Giperbola", 44));
        data.add(new MundarijaModel("Parabola", 47));
        data.add(new MundarijaModel("Qutb koordinatalar sistemasi", 49));
        data.add(new MundarijaModel("Fazodagi analitik geometriyaning asosiy tushunchalari va masalalari", 51));
        data.add(new MundarijaModel("Tekislikda va fazoda vektorlar", 53));
        data.add(new MundarijaModel("Fazoda tekislik va uning tenglamasi", 66));
        data.add(new MundarijaModel("Fazoda to’g’ri chiziq va uning tenglamasi", 72));
        data.add(new MundarijaModel("Fazodagi to’g’ri chiziq va tekislik", 75));
        data.add(new MundarijaModel("Ikkinchi tartibli sirtlar", 78));
        data.add(new MundarijaModel("O’zgaruvchi va o’zgarmas miqdorlar, funksiya tushunchasi", 84));
        data.add(new MundarijaModel("Ketma-ketlik va uning limiti", 92));
        data.add(new MundarijaModel("Funksiyaning limiti", 97));
        data.add(new MundarijaModel("Funksiyaning uzluksizligi", 103));
        data.add(new MundarijaModel("Argument va funksiya orttirmasi. Hosila va uni hisoblash", 109));
        data.add(new MundarijaModel("Oshkormas funksiya va uning hosilasi. Parametrik shaklda berilgan funksiya va uning hosilasi", 117));
        data.add(new MundarijaModel("Yuqori tartibli hosilalar", 118));
        data.add(new MundarijaModel("Hosilaning geometrik ma’nosi", 120));
        data.add(new MundarijaModel("Hosilaning fizik tatbiqlari", 123));
        data.add(new MundarijaModel("Aniqmasliklar va Lopital qoidalari", 124));
        data.add(new MundarijaModel("Funksiyaning o’sish va kamayishi", 127));
        data.add(new MundarijaModel("Funksiyaning ekstremumlari", 128));
        data.add(new MundarijaModel("Funksiyaning kesmadagi eng katta va eng kichik qiymatlari", 129));
        data.add(new MundarijaModel("Funksiya grafigining qavariqlik va botiqlik oraliqlar. Bukilish nuqtalar. Assimptotalar", 132));
        data.add(new MundarijaModel("Funksiyaning differensiali", 134));
        data.add(new MundarijaModel("Teylor va Makloren formulalari", 137));
        data.add(new MundarijaModel("Boshlang’ich funksiya va aniqmas integral. Aniqmas integralni bevosita hisoblash", 139));
        data.add(new MundarijaModel("Aniqmas integralda o’zgaruvchini almashtirish. Bo’laklabintegrallash", 143));
        data.add(new MundarijaModel("Trigonometrik funksiyalarni integrallash", 146));
        data.add(new MundarijaModel("Giperbolik funksiyalarni integrallash", 148));
        data.add(new MundarijaModel("Kvadrat uchhad qatnashgan integrallarni hisoblash", 149));
        data.add(new MundarijaModel("Eng sodda ratsional kasrlar va ularni integrallash", 152));
        data.add(new MundarijaModel("Ratsional kasrlarni integrallash", 154));
        data.add(new MundarijaModel("Irratsional funksiyalarni integrallash", 157));
        data.add(new MundarijaModel("Aniq integral va uni hisoblash", 162));
        data.add(new MundarijaModel("Xosmas integrallar", 167));
        data.add(new MundarijaModel("Aniq integralning geometrik tadbiqlari", 170));
        data.add(new MundarijaModel("Aniq integralning mexanik tadbiqlari", 179));
        data.add(new MundarijaModel("Aniq integralning fizik tadbiqlari", 183));
        data.add(new MundarijaModel("Aniq integralni taqribiy hisoblash", 184));
        data.add(new MundarijaModel("Ko’p o’zgaruvchili funksiya, uning limiti va uzluksizligi", 188));
        data.add(new MundarijaModel("Ko’p o’zgaruvchili funksiyaning xususiy va to’la orttirmalari. Xususiy hosilalar. To’liq differensial", 191));
        data.add(new MundarijaModel("Murakkab va oshkormas funksiyalarning xususiy hosilalari", 194));
        data.add(new MundarijaModel("Yuqori tartibli xususiy hosilalar va to’liq differensiallar", 197));
        data.add(new MundarijaModel("Sirtga urinma tekislik va normal. Yo’nalish bo’yicha hosila. Gradient", 198));
        data.add(new MundarijaModel("Ko’p o’zgaruvchili funksiyaning ekstremumlari. Teylor formulasi", 200));
        data.add(new MundarijaModel("Differensial tenglamalar bo’yicha asosiy tushunchalar. Birinchi tartibli tenglamalar. O’zgaruvchilari ajralgan va ajraladigan tenglamalar. Bir jinsli va bir jinsli tenglamaga keltiriladigan tenglamalar. To’la differensialli tenglamalar", 205));
        data.add(new MundarijaModel("Birinchi tartibli chiziqli tenglama. Bernulli tenglamasi", 211));
        data.add(new MundarijaModel("Yuqori tartibli differensial tenglamalar", 214));
        data.add(new MundarijaModel("Bir jinsli chiziqli tenglamalar", 218));
        data.add(new MundarijaModel("O’zgarmas koeffitsientli ikkinchi tartibli bir jinsli chiziqli tenglamalar", 221));
        data.add(new MundarijaModel("n-tartibli o’zgarmas koeffitsientli bir jinsli chiziqli tenglamalar", 223));
        data.add(new MundarijaModel("Ikkinchi tartibli o’zgarmas koeffitsientli chiziqli bir jinslimas chiziqli tenglamalar", 226));
        data.add(new MundarijaModel("Differensial tenglamalar sistemasi", 234));
        data.add(new MundarijaModel("Sonli qatorlar", 237));
        data.add(new MundarijaModel("Musbat hadli qatorlarning yaqinlashish va uzoqlashish alomatlari", 239));
        data.add(new MundarijaModel("O’zgaruvchan ishorali qatorlar", 243));
        data.add(new MundarijaModel("Funksional qatorlar", 244));
        data.add(new MundarijaModel("Darajali qatorlar", 247));
        data.add(new MundarijaModel("Funksiyalarni Teylor va Makloren qatorlariga yoyish", 249));
        data.add(new MundarijaModel("Furye qatorlari", 252));
        data.add(new MundarijaModel("Ikki o’lchovli integral va uni hisoblash", 254));
        data.add(new MundarijaModel("Ikki o’lchovli integrallar yordamida yuzlar va hajmlarni hisoblash", 258));
        data.add(new MundarijaModel("Uch o’lchovli integral va uni hisoblash", 261));
        data.add(new MundarijaModel("Birinchi va ikkinchi tur egri chiziqli integrallar", 264));
        data.add(new MundarijaModel("GLOSSARIY", 269));
        data.add(new MundarijaModel("ADABIYOTLAR", 287));


        recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

        mundarijaAdapter = new MundarijaAdapter(mContext, data);
        mundarijaAdapter.setClickListener(this);
        recyclerView.setAdapter(mundarijaAdapter);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onItemClick(View view, int position) {
        MainActivity.defaultPage = data.get(position).getPage();

        MainActivity.toolbar.setTitle("Bosh sahifa");
        getActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.nav_host_fragment,
                        new HomeFragment())

                .commit();

        getActivity().getSupportFragmentManager().popBackStackImmediate();

        MainActivity.navPage = R.id.nav_home;


    }
}