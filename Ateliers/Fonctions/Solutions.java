/*
 * Copyright 2018 Jacques Berger.
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

class Solutions {
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public static int absolue(int a) {
        if (a < 0) {
            return a * -1;
        } else {
            return a;
        }
    }

    public static boolean estPair(int a) {
        return a % 2 == 0;
    }

    public static boolean estUnMultiple(int nombre, int diviseur) {
        return nombre % diviseur == 0;
    }

    public static boolean estDansIntervalle(int nombre, int borneMin, int borneMax) {
        return nombre >= borneMin && nombre <= borneMax;
    }

    public static double moyenne(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double moyenne(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
