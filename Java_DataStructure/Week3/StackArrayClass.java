import javax.swing.JOptionPane;

public class StackArrayClass {
    private int maxStackSize; // ขนาดสูงสุดของ Stack
    private int stackTop;     // ตัวชี้ตำแหน่งบนสุดของ Stack (ในที่นี้คือจำนวน item)
    private int[] list;       // Array สำหรับเก็บข้อมูล

    // 1. Constructor ค่าเริ่มต้น
    public StackArrayClass() {
        maxStackSize = 10;
        stackTop = 0;
        list = new int[maxStackSize];
        for (int i = 0; i < maxStackSize; i++) {
            list[i] = -1;
        }
    }

    // 2. Constructor กำหนดขนาดเอง
    public StackArrayClass(int size) {
        if (size <= 0) {
            JOptionPane.showMessageDialog(null, "Size Error, use default 10");
            maxStackSize = 10;
        } else {
            maxStackSize = size;
        }
        stackTop = 0;
        list = new int[maxStackSize];
        for (int i = 0; i < maxStackSize; i++) {
            list[i] = -1;
        }
    }

    // 3. Initialization (ล้างค่าใน Stack ทั้งหมด)
    public void initializeStack() {
        for (int i = 0; i < maxStackSize; i++) {
            list[i] = -1;
        }
        stackTop = 0;
        JOptionPane.showMessageDialog(null, "Stack Initialized");
    }

    // 4. ตรวจสอบว่า Stack ว่างหรือไม่
    public boolean isEmptyStack() {
        return (stackTop == 0);
    }

    // 5. ตรวจสอบว่า Stack เต็มหรือไม่
    public boolean isFullStack() {
        return (stackTop == maxStackSize);
    }

    // 6. เพิ่มข้อมูล (Push)
    public void push(int item) {
        if (isFullStack()) {
            JOptionPane.showMessageDialog(null, "No Push Item (Stack Full)");
        } else {
            list[stackTop] = item;
            stackTop++;
        }
    }

    // 7. ดูค่าบนสุด (Top) - ต้องใช้ชื่อ top() ตามไฟล์ SampleStack
    public int top() {
        if (isEmptyStack()) {
            return -1;
        } else {
            return list[stackTop - 1];
        }
    }

    // 8. ดึงข้อมูลออก (Pop)
    public void pop() {
        if (isEmptyStack()) {
            JOptionPane.showMessageDialog(null, "No Pop Item (Stack Empty)");
        } else {
            stackTop--; // ลดตำแหน่งลง
            int removeItem = list[stackTop];
            list[stackTop] = -1; // เคลียร์ค่า
            JOptionPane.showMessageDialog(null, "Pop is " + removeItem);
        }
    }

    // 9. แสดงผลข้อมูลทั้งหมด (Print)
    public void printStack() {
        String output = "-- Stack (Array) --\n";
        if (isEmptyStack()) {
            output += "Stack is Empty";
        } else {
            // วนลูปจากตำแหน่งบนสุดลงมาข้างล่าง
            for (int i = stackTop - 1; i >= 0; i--) {
                output += "Pos [" + i + "] => " + list[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}