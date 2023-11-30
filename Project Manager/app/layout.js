import './globals.css'
import { Navbar } from './components/Navbar'
import { BioRhyme } from 'next/font/google';

const bioRhyme = BioRhyme({ subsets: ['latin-ext'], weights: [400, 700] });

export default function RootLayout({ children }) {
  return (
    <html lang="en">
      <head>
        <title>Task Manager Specialization Project</title>
      </head>

      <body className={bioRhyme.className}>
        <Navbar />
        {children}
      </body>
    </html>
  )
}
